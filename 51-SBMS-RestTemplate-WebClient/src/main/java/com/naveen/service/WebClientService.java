package com.naveen.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class WebClientService {

    private final WebClient.Builder webClientBuilder;

    public WebClientService(WebClient.Builder webClientBuilder) {
        this.webClientBuilder = webClientBuilder;
    }

    public String getDataFromExternalApi() {
        String url = "https://jsonplaceholder.typicode.com/posts/1"; // Example API
        WebClient webClient = webClientBuilder.baseUrl(url).build();

        return webClient.get()
                .retrieve()
                .bodyToMono(String.class)
                .block();
    }

//    public String createPost(String title, String body) {
//        String url = "https://jsonplaceholder.typicode.com/posts";
//        String requestJson = "{ \"title\": \"" + title + "\", \"body\": \"" + body + "\" }";
//
//        WebClient webClient = webClientBuilder.baseUrl(url).build();
//        
//        return webClient.post()
//                .bodyValue(requestJson)
//                .retrieve()
//                .onStatus(HttpStatus::is4xxClientError, clientResponse -> {
//                    throw new RuntimeException("Client Error: " + clientResponse.statusCode());
//                })
//                .onStatus(HttpStatus::is5xxServerError, clientResponse -> {
//                    throw new RuntimeException("Server Error: " + clientResponse.statusCode());
//                })
//                .bodyToMono(String.class)
//                .block();
//    }
    
    
    
    public String createPost(String title, String body) {
        String url = "https://jsonplaceholder.typicode.com/posts";
        String requestJson = "{ \"title\": \"" + title + "\", \"body\": \"" + body + "\" }";

        WebClient webClient = webClientBuilder.build();

        return webClient.post()
                .uri(url)
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .bodyValue(requestJson)
                .retrieve()
//                .onStatus(HttpStatus::is4xxClientError, clientResponse ->
//                        clientResponse.bodyToMono(String.class)
//                                .flatMap(errorBody -> Mono.error(new RuntimeException("Client Error: " + errorBody)))
//                )
//                .onStatus(HttpStatus::is5xxServerError, clientResponse ->
//                        clientResponse.bodyToMono(String.class)
//                                .flatMap(errorBody -> Mono.error(new RuntimeException("Server Error: " + errorBody)))
//                )
                .bodyToMono(String.class)
                .block();
    }

    
    

    public String updatePost(int postId, String title, String body) {
        String url = "https://jsonplaceholder.typicode.com/posts/" + postId;
        String requestJson = "{ \"title\": \"" + title + "\", \"body\": \"" + body + "\" }";

        WebClient webClient = webClientBuilder.baseUrl(url).build();

        return webClient.put()
                .bodyValue(requestJson)
                .retrieve()
                .bodyToMono(String.class)
                .block();
    }

    public String deletePost(int postId) {
        String url = "https://jsonplaceholder.typicode.com/posts/" + postId;
        WebClient webClient = webClientBuilder.baseUrl(url).build();

        webClient.delete()
                .retrieve()
                .bodyToMono(Void.class)
                .block();
        
        return "Post deleted successfully!";
    }
}
