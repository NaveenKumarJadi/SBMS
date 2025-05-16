package com.naveen.binding;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.naveen.binding.Book;

public class JsonToJavaConvertor {

	public static void main(String[] args) throws Exception {
		
		File jsonFile = new File("book.json");
		
		ObjectMapper mapper = new ObjectMapper();
		
		Book book = mapper.readValue(jsonFile, Book.class);
		
		System.out.println(book);
		
	}
}
