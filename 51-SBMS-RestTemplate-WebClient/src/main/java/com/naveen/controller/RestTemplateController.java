package com.naveen.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.naveen.service.RestTemplateService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/restTemplate")
public class RestTemplateController {

	private final RestTemplateService apiService;

	public RestTemplateController(RestTemplateService apiService) {
		this.apiService = apiService;
	}

	@GetMapping("/fetch-data")
	public String fetchData() {
		log.info("Entering ApiController.fetchData method");
		return apiService.getDataFromExternalApi(); // Call service method to fetch data
	}

	@PostMapping("/create-post")
	public String createPost(@RequestParam String title, @RequestParam String body) {
		return apiService.createPost(title, body);
	}

	@PutMapping("/update-post/{id}")
	public String updatePost(@PathVariable int id, @RequestParam String title, @RequestParam String body) {
		return apiService.updatePost(id, title, body);
	}

	@DeleteMapping("/delete-post/{id}")
	public String deletePost(@PathVariable int id) {
		return apiService.deletePost(id);
	}
	
//	@GetMapping("/users")
//    public ResponseEntity<List<User>> getAllUsers() {
//        ResponseEntity<User[]> response = restTemplate.getForEntity("http://localhost:8081/api/users", User[].class);
//        List<User> userList = Arrays.asList(response.getBody());
//        return ResponseEntity.ok(userList);
//    }
}

/*
GET http://localhost:8080/api/fetch-data (Fetch data from external API)

POST http://localhost:8080/api/create-post?title=New+Title&body=This+is+content

PUT http://localhost:8080/api/update-post/1?title=Updated+Title&body=Updated+content

DELETE http://localhost:8080/api/delete-post/1

*/