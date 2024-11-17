package com.naveen.multidb.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = "com.naveen.multidb.mongo.repository")
public class MongoConfig {
    // MongoDB configuration is automatically handled by Spring Boot
}