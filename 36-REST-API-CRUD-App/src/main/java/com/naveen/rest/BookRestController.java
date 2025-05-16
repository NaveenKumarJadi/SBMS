package com.naveen.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.naveen.entity.Book;
import com.naveen.service.BookService;

@RestController
public class BookRestController {

	@Autowired
	private BookService service;
	
	@PostMapping("/book")
	public ResponseEntity<String> addBook(@RequestBody Book book){
		String msg = service.upsertBook(book);
		return new ResponseEntity<String>(msg, HttpStatus.CREATED);
	}
	
	@GetMapping("/books")
	public ResponseEntity<List<Book>> getAllBooks(){
		List<Book> allBooks = service.getAllBooks();
		return new ResponseEntity<List<Book>>(allBooks, HttpStatus.OK);
	}
	
	@PutMapping("/book")
	public ResponseEntity<String> updateBook(@RequestBody Book book){
		String msg = service.upsertBook(book);
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}
	
	@DeleteMapping("/book/{bookId}")
	public ResponseEntity<String> deleteBook(@PathVariable Integer bookId){
		String msg = service.deleteBook(bookId);
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}
}

