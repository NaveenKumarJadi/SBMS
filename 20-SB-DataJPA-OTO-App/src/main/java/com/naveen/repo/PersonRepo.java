package com.naveen.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.naveen.entity.Person;

public interface PersonRepo extends JpaRepository<Person, Integer> {

}
