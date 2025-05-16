package com.naveen.rest;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.naveen.db1.entity.User;
import com.naveen.db1.repositories.UserRepository;
import com.naveen.db2.entity.Book;
import com.naveen.db2.repositories.BookRepositories;


@RestController
public class DemoRestController {

	@Autowired
	private BookRepositories bookRepository;

	@Autowired
	private UserRepository userRepository;

	@GetMapping("/data")
	public String addData2DB() {
		
		userRepository.saveAll(Stream.of(new User(1, "Naveen", "naveen@gmail.com"), new User(2, "Jyothi", "jyoti@gmail.com")).collect(Collectors.toList()));
		bookRepository.saveAll(Stream.of(new Book(111, "Core Java", 120.00), new Book(222, "Spring Boot", 250.00)).collect(Collectors.toList()));
		
		return "Data Added Successfully";
	}

	@GetMapping("/users")
	public List<User> getUsers() {
		return userRepository.findAll();
	}

	@GetMapping("/books")
	public List<Book> getBooks() {
		return bookRepository.findAll();
	}

}