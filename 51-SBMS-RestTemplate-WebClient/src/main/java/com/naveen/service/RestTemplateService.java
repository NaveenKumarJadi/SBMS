package com.naveen.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RestTemplateService {

	private final RestTemplate restTemplate;

	public RestTemplateService() {
		this.restTemplate = new RestTemplate();
	}

	public String getDataFromExternalApi() {
		String url = "https://jsonplaceholder.typicode.com/posts/1"; // Example public API
		return restTemplate.getForObject(url, String.class); // GET Request
	}

	public String createPost(String title, String body) {
		String url = "https://jsonplaceholder.typicode.com/posts";
		String requestJson = "{ \"title\": \"" + title + "\", \"body\": \"" + body + "\" }";

		return restTemplate.postForObject(url, requestJson, String.class);
	}

	public String updatePost(int postId, String title, String body) {
		String url = "https://jsonplaceholder.typicode.com/posts/" + postId;
		String requestJson = "{ \"title\": \"" + title + "\", \"body\": \"" + body + "\" }";

		restTemplate.put(url, requestJson);
		return "Post updated successfully!";
	}

	public String deletePost(int postId) {
		String url = "https://jsonplaceholder.typicode.com/posts/" + postId;
		restTemplate.delete(url);
		return "Post deleted successfully!";
	}
}
