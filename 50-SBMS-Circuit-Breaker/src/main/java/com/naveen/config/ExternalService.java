package com.naveen.config;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ExternalService {

    private final RestTemplate restTemplate = new RestTemplate();
    private static final String SERVICE_NAME = "externalService";

    @CircuitBreaker(name = SERVICE_NAME, fallbackMethod = "fallbackResponse")
    public String callExternalApi() {
        // Simulate calling a slow or unreliable external API
        String url = "http://localhost:8081/dummy-api";
        return restTemplate.getForObject(url, String.class);
    }

    public String fallbackResponse(Throwable t) {
        return "External service is currently unavailable. Please try again later.";
    }
}
