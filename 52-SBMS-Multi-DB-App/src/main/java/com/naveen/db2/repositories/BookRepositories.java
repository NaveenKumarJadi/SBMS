package com.naveen.db2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.naveen.db2.entity.Book;

public interface BookRepositories extends JpaRepository<Book, Integer> {

}
