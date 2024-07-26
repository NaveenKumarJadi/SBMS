package com.naveen.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.naveen.entity.Product;

public interface ProductRepository extends JpaRepository<Product, String> {

}
