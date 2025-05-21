package com.naveen.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.naveen.model.User;
import com.naveen.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	@Cacheable(value = "users", key = "#id")
	public Optional<User> getUserById(Long id) {
		System.out.println("Fetching from DB for id: " + id);
		return userRepository.findById(id);
	}

//	@CachePut(value = "users", key = "'all'")
	@CachePut(value = "users", key = "#user.id")
	public User saveUser(User user) {
		return userRepository.save(user);
	}

	@CacheEvict(value = "users", key = "#id")
	public void deleteUser(Long id) {
		userRepository.deleteById(id);
	}

	@Cacheable(value = "users")
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}
}
