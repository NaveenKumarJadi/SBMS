package com.naveen.config;

import java.util.Random;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@Service
public class ExternalService {

	private final RestTemplate restTemplate = new RestTemplate();
	private static final String SERVICE_NAME = "externalService";

	@CircuitBreaker(name = SERVICE_NAME, fallbackMethod = "fallbackResponse")
	public String callExternalApi() {
		// Simulate calling a slow or unreliable external API
//        String url = "http://localhost:8081/dummy-api";
//        return restTemplate.getForObject(url, String.class);

		System.out.println("Simulating random failure...");
		if (new Random().nextBoolean()) {
			throw new RuntimeException("Simulated service failure");
		}
		return "Harry Potter - J.K. Rowling";
	}

	public String fallbackResponse(Throwable t) {
		return "External service is currently unavailable. Please try again later.";
	}

}
