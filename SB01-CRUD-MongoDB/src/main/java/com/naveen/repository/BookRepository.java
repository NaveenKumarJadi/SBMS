package com.naveen.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.naveen.model.Book;

public interface BookRepository extends MongoRepository<Book, String> {
	public Book findByBookId(Integer bookId);
}
