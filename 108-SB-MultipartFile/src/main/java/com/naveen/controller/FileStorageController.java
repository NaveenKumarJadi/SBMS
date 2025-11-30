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

import com.naveen.service.StorageService;

@RestController
@RequestMapping("/fileDB")
public class FileStorageController {

	@Autowired
    private StorageService service;

//	Storing files in database is not recommended
	
    @PostMapping
    public ResponseEntity<String> upload(@RequestParam("file") MultipartFile file) throws IOException {
    	
    	String uploadFile = service.uploadFile(file);
    	
        return ResponseEntity.status(HttpStatus.OK).body(uploadFile);
    }

    @GetMapping("/{fileName}")
    public ResponseEntity<byte[]> download(@PathVariable String fileName) {

        byte[] fileData = service.downloadFile(fileName);
        String contentType = service.getContentType(fileName);

        return ResponseEntity.status(HttpStatus.OK)
                .contentType(MediaType.valueOf(contentType))
                .body(fileData);
    }

}
