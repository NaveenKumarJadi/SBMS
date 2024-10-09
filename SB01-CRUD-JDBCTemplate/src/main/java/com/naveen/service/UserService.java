package com.naveen.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.naveen.entity.User;
import com.naveen.repository.UserRepository;

@Service
public class UserService {
   
	private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getUserById(Integer id) {
        return userRepository.findById(id);
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public int updateUser(User user) {
        return userRepository.update(user);
    }

    public int deleteUser(Integer id) {
        return userRepository.deleteById(id);
    }
}