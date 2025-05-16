package com.naveen.client;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.naveen.binding.Book;

@Service
public class BookClient {
	
		public void invokeSaveBook() {
		
		Book book = new Book();
		book.setBookName("Angular");
		book.setBookPrice(450.00);
		
		String apiUrl = "https://naveenit-book-app.herokuapp.com/books";
		
		WebClient client = WebClient.create();
		
		String resp = client.post()		//HTTP POST Request
							  .uri(apiUrl) // Endpoint URL
							  .bodyValue(book)	//HTTP Request Body Data
							  .retrieve()	//Retrieve HTTP Response Body
							  .bodyToMono(String.class)	//Bind Response to String Var
							  .block(); //Make it as Sync Client
		
		System.out.println(resp);
	}
	
	
	public void invokeGetBooks() {
		
		String apiUrl = "https://naveenit-book-app.herokuapp.com/books";
		
		WebClient client = WebClient.create();
		
		/*
		String body = client.get()		// GET Request
							.uri(apiUrl)	// Endpoint URL
							.retrieve()		// retrieve response body
							.bodyToMono(String.class)	//bind response data to String var
							.block();	//make it sync
			
			System.out.println(responseData);
		*/
		
		
		Book[] responseData = client.get()
									.uri(apiUrl)
								    .retrieve()
								    .bodyToMono(Book[].class)
								    .block();  // sync Communication
		
		for(Book b: responseData) {
			System.out.println(b);
		}
		
	}
	
	
		public void invokeGetBooksAsync() {
			String apiUrl = "https://naveenit-book-app.herokuapp.com/books";
			WebClient client = WebClient.create();
			
			client.get()
					.uri(apiUrl)
					.retrieve()
					.bodyToMono(Book[].class)
					.subscribe(BookClient::respHandler); //Async Communication
			
			System.out.println("*****************Request Sent**************");
	}
	
	
	public static void respHandler(Book[] books) {
		for(Book b: books) {
			System.out.println(b);
		}
	}
}
	