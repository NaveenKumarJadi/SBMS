package com.naveen.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.naveen.service.WebClientService;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/webClient")
public class WebClientController {

	private final WebClientService clientService;

	public WebClientController(WebClientService clientService) {
		this.clientService = clientService;
	}

	@GetMapping("/fetch-data")
	public String fetchData() {
		return clientService.getDataFromExternalApi();
	}

	@PostMapping("/create-post")
	public String createPost(@RequestParam String title, @RequestParam String body) {
		return clientService.createPost(title, body);
	}

	@PutMapping("/update-post/{id}")
	public String updatePost(@PathVariable int id, @RequestParam String title, @RequestParam String body) {
		return clientService.updatePost(id, title, body);
	}

	@DeleteMapping("/delete-post/{id}")
	public String deletePost(@PathVariable int id) {
		return clientService.deletePost(id);
	}
	
//	@GetMapping("/users")
//    public Mono<List<User>> getAllUsers() {
//        return webClientBuilder.build()
//                .get()
//                .uri("http://localhost:8081/api/users")
//                .retrieve()
//                .bodyToFlux(User.class)
//                .collectList();
//    }
}




//GET http://localhost:8080/apis/fetch-data (Fetch data from external API)
//
//POST http://localhost:8080/apis/create-post?title=New+Post&body=This+is+content
//
//PUT http://localhost:8080/apis/update-post/1?title=Updated+Post&body=Updated+content
//
//DELETE http://localhost:8080/apis/delete-post/1
