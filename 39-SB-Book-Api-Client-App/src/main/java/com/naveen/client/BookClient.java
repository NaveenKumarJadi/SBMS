package com.naveen.client;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.naveen.binding.Book;

@Service
public class BookClient {

	public void invokeBookTicket() {

		String apiUrl = "https://naveenit-book-app.herokuapp.com/book";

		Book book = new Book();
		book.setBookName("Java");
		book.setBookPrice(345.00);

		RestTemplate rt = new RestTemplate();

		ResponseEntity<String> postForEntity = rt.postForEntity(apiUrl, book, String.class);
		System.out.println(postForEntity.getBody());
	}

	public void invokeGetBooksOld() {

		String apiUrl = "https://naveenit-book-app.herokuapp.com/books";

		RestTemplate rt = new RestTemplate();
		ResponseEntity<String> forEntity = rt.getForEntity(apiUrl, String.class);
		String body = forEntity.getBody();
		System.out.println(body);
	}

	public void invokeGetBooksNew() {
		String apiUrl = "https://naveenit-book app.herokuapp.com/books";
		RestTemplate rt = new RestTemplate();
		ResponseEntity<Book[]> forEntity = rt.getForEntity(apiUrl, Book[].class);
		Book[] body = forEntity.getBody();
		for (Book book : body) {
			System.out.println(book);
		}
	}

}
