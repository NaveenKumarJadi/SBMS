package com.naveen.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.naveen.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
