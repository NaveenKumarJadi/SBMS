package com.naveen.binding;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JavaToJsonConvertor {

	public static void main(String[] args) throws Exception {

		Author author = new Author();
		author.setAuthorName("Rod Johnson");
		author.setAuthorEmail("r.john@gmail.com");
		author.setAuthorPhno((long) 868686861);
		
		Book book = new Book();
		book.setId(101);
		book.setName("Spring");
		book.setPrice(450.00);
		book.setAuthor(author);
		
		ObjectMapper mapper = new ObjectMapper();
		
//		Converting Java obj to json and store into a file
		mapper.writeValue(new File("book.json"), book);
		
		System.out.println("Conversion Completed...");

	}
}
