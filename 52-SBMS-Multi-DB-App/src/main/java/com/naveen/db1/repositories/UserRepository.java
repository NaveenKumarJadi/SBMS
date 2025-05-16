package com.naveen.db1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.naveen.db1.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
