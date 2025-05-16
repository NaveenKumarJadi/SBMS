package com.naveen.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.naveen.bindings.Book;

@Controller
public class BookController {

	@GetMapping("/book")
	public String getBookData(Model model) {

//		setting data to binding obj
		Book bookObj = new Book(101, "Spirng", 450.00);

//		adding data to model obj to send to UI
		model.addAttribute("book", bookObj);

//		return view name
		return "book";
	}

	@GetMapping("/books")
	public String getBooksData(Model model) {
		
//		setting data to binding obj
		Book b1 = new Book(101, "Spring", 350.00);
		Book b2 = new Book(102, "Python", 450.00);
		Book b3 = new Book(103, "AWS", 550.00);
		
		List<Book> booksList = Arrays.asList(b1, b2, b3);
		
//		adding data to model obj to send to UI
		model.addAttribute("books", booksList);
		
//		return view name
		return "books";
	}
}
