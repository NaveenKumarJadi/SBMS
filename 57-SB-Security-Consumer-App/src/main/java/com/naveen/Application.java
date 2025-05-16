package com.naveen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		String apiUrl = "http://localhost:8080/welcome";
		
		HttpHeaders headers = new HttpHeaders();
		headers.setBasicAuth("navin", "navin@123");
		HttpEntity<String> reqEntity = new HttpEntity<>(headers);
		
		RestTemplate rt = new RestTemplate();
		
		// it will work if the url is not secured 
//		ResponseEntity<String> forEntity = rt.getForEntity(apiUrl, String.class);
		
		ResponseEntity<String> resEntity = rt.exchange(apiUrl, HttpMethod.GET , reqEntity, String.class);
		
		System.out.println(resEntity.getBody());
	}

	
	
}
