package com.naveen.multidb.service;

import com.naveen.multidb.mysql.model.User;
import com.naveen.multidb.mongo.model.Product;
import com.naveen.multidb.mysql.repository.UserRepository;
import com.naveen.multidb.mongo.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DataService {
    private final UserRepository userRepository;
    private final ProductRepository productRepository;

    // MySQL operations
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // MongoDB operations
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
}