package com.naveen.service;

import java.io.IOException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.naveen.entity.FileStorage;
import com.naveen.repository.StorageRepository;
import com.naveen.util.FileUtils;

@Service
public class StorageService {

    @Autowired
    private StorageRepository repository;
    
    
    public String uploadFile(MultipartFile file) throws IOException {
    	
    	byte[] fileBytes = file.getBytes();
    	
    	byte[] finalData;
    	
    	if(FileUtils.isCompressible(file.getContentType())) {
    		finalData = FileUtils.compress(fileBytes);
    				
    	} else {
    		finalData = fileBytes;
    	}
    	
		FileStorage fileEntity = FileStorage.builder()
				.fileName(file.getOriginalFilename())
				.contentType(file.getContentType())
				.fileSize(file.getSize())
				.fileData(finalData)
				.build();
    	
		repository.save(fileEntity);
		
    	return "File uploaded successfully : " + file.getOriginalFilename();
    	
    }
    
	public byte[] downloadFile(String fileName) {

		Optional<FileStorage> optionalFile = repository.findByFileName(fileName);

		if (optionalFile.isEmpty()) {
			throw new RuntimeException("File not found");
		}

		FileStorage file = optionalFile.get();

		if (FileUtils.isCompressible(file.getContentType())) {
			 byte[] fileData = FileUtils.decompress(file.getFileData());
			 
			 return fileData;
		}

		return file.getFileData();

	}
	
	 public String getContentType(String fileName) {
	        return repository.findByFileName(fileName)
	                .map(FileStorage::getContentType)
	                .orElse("application/octet-stream");
	    }

}