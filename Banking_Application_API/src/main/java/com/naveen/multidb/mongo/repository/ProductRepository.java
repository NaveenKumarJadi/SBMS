package com.naveen.multidb.mongo.repository;

import com.naveen.multidb.mongo.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}