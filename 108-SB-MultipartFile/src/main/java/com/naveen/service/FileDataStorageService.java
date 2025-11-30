package com.naveen.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.naveen.entity.FileData;
import com.naveen.repository.FileDataRepository;

@Service
public class FileDataStorageService {

    @Value("${file.upload-dir}")
    private String uploadDir;

    @Autowired
    private FileDataRepository repository;

    public String uploadFile(MultipartFile file) throws IOException {

        // 1. Validate file size
        if (file.getSize() == 0) {
            throw new RuntimeException("Empty file not allowed.");
        }

        // 2. Validate name
        String originalName = Paths.get(file.getOriginalFilename()).getFileName().toString();

        // 3. Prevent path traversal attack
        if (originalName.contains("..")) {
            throw new RuntimeException("Invalid file path.");
        }

        // 4. Create upload directory if not present
        Files.createDirectories(Paths.get(uploadDir));

        // 5. Generate unique filename for storage
        String uniqueName = UUID.randomUUID() + "_" + originalName;
        String fullPath = uploadDir + uniqueName;

        // 6. Save file to filesystem
        Path filePath = Paths.get(fullPath);
        Files.copy(file.getInputStream(), filePath, StandardCopyOption.REPLACE_EXISTING);

        // 7. Save metadata in DB
        FileData fileData = FileData.builder()
                .name(originalName)
                .type(file.getContentType())
                .storedName(uniqueName)
                .filePath(fullPath)
                .build();

        repository.save(fileData);

        return "File uploaded successfully: " + originalName;
    }


    public byte[] downloadFile(String fileName) throws IOException {

        // fetch metadata
        Optional<FileData> fileOpt = repository.findByName(fileName);
        if (fileOpt.isEmpty()) {
            throw new RuntimeException("File not found: " + fileName);
        }

        FileData fileData = fileOpt.get();
        Path path = Paths.get(fileData.getFilePath());

        return Files.readAllBytes(path);
    }

    public String getFileContentType(String fileName) {
        return repository.findByName(fileName)
                .map(FileData::getType)
                .orElse("application/octet-stream");
    }
}
