package com.naveen.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.naveen.service.FileDataStorageService;

@RestController
@RequestMapping("/filesInFileSystem")
public class FileDataController {

	@Autowired
	private FileDataStorageService service;

	@PostMapping("/upload")
	public ResponseEntity<String> upload(@RequestParam("file") MultipartFile file) throws IOException {

		String uploadFile = service.uploadFile(file);

		return ResponseEntity.status(HttpStatus.OK).body(uploadFile);
	}

	@GetMapping("/{fileName}")
	public ResponseEntity<byte[]> download(@PathVariable String fileName) throws IOException {
		
		byte[] fileData = service.downloadFile(fileName);
		String contentType = service.getFileContentType(fileName);

		return ResponseEntity.status(HttpStatus.OK)
				.contentType(MediaType.parseMediaType(contentType))
				.body(fileData);
	}

}
