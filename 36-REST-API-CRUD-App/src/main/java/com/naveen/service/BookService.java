package com.naveen.service;

import java.util.List;

import com.naveen.entity.Book;

public interface BookService {

	public String upsertBook(Book book);
//	public String addOrUpdateBook(Book book);
	
	public List<Book> getAllBooks();
	
//	public String updateBook(Book book);
	
	public String deleteBook(Integer bookId);
	
}
