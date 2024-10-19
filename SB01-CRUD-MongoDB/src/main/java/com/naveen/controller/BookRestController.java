package com.naveen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.naveen.model.Book;
import com.naveen.repository.BookRepository;

@RestController
public class BookRestController {

	@Autowired
	private BookRepository bookRepository;
	
	@PostMapping("/book")
	public ResponseEntity<String> addBook(@RequestBody Book book){
		bookRepository.save(book);
		return new ResponseEntity<String>("Book Saved", HttpStatus.CREATED);
	}
	
	@GetMapping("/books")
	public List<Book> books(){
		return bookRepository.findAll();
	}

	@GetMapping("/book/{bookId}")
	public Book getBookById(@PathVariable Integer bookId){
		return bookRepository.findByBookId(bookId);
	}
	
	@DeleteMapping("/book/{id}")
	public String deleteBookById(@PathVariable String id){
		bookRepository.deleteById(id);
		return "Deleted Successfully";
	}
	
	
}
