package com.naveen.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.naveen.entity.Book;

public interface BookRepository extends JpaRepository<Book, Serializable> {

}
