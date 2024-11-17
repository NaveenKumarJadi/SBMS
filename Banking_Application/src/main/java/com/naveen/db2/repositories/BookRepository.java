package com.naveen.db2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.naveen.db2.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
