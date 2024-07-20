package com.naveen.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.naveen.exception.NoDataFoundException;

@RestController
public class BookController {

	@GetMapping("/price/{isbn}")
	public String getPrice(@PathVariable String isbn) {
		
		String msg = " ";
		
		if(isbn.equals("ISBNS001")) {
			msg = "Book Price Is : 400 $";
		}else {
			throw new NoDataFoundException("Invalid ISBN");
		}
		return msg;
	}
}
