package com.naveen.db1.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.naveen.db1.entity.User;

public interface UserRepository extends MongoRepository<User, String> {
//	public User findByBookId(Integer UserId);
}
