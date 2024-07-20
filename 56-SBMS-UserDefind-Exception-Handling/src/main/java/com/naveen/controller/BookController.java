package com.naveen.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.naveen.exception.NoDataFoundException;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class BookController {

	@GetMapping("/price/{isbn}")
	public String getPrice(@PathVariable String isbn) {

		String msg = " ";

		if (isbn.equals("ISBNS001")) {
			msg = "Book Price Is : 400 $";
		} else {
			log.info("Enter the valid details : {} " + isbn);
			throw new NoDataFoundException("Invalid ISBN");
		}
		return msg;
	}

	
	@GetMapping("/welcome")
	public String welcome() {

		String msg = "Welcome to ABC IT";

		try {
			int i = 10 / 0;

		} catch (Exception e) {
			log.info("Exception Occured: " + e, e);
			throw new ArithmeticException(e.getMessage());
		}
		return msg;
	}
}


// http://localhost:8080/price/ISBNS001