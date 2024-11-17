package com.naveen.config;

import java.util.HashMap;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

import jakarta.persistence.EntityManagerFactory;


import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = "com.naveen.db1.repositories")
public class UserDBConfig {
    // MongoDB configuration is automatically handled by Spring Boot
}

/*
 * @Configuration
 * 
 * @EnableTransactionManagement
 * 
 * @EnableJpaRepositories( entityManagerFactoryRef = "entityManagerFactory",
 * basePackages = { "com.naveen.db1.repositories" } ) public class UserDBConfig
 * {
 * 
 * @Primary
 * 
 * @Bean(name = "dataSource") // @ConfigurationProperties(prefix =
 * "spring.db1.datasource")
 * 
 * @ConfigurationProperties(prefix = "spring.db1.data.mongodb")
 * // @ConfigurationProperties(prefix = "spring.datasource.h2") public
 * DataSource dataSource() { return DataSourceBuilder.create() //
 * .driverClassName("org.h2.Driver") .url("mongodb://localhost:27017") //
 * .username("sa") // .password("sa") .build(); }
 * 
 * // @Bean // public MongoClient mongoClient() { // return MongoClients.create(
 * "mongodb://username:password@localhost:27017/yourDatabaseName"); // } //
 * // @Bean // public MongoTemplate mongoTemplate() { // return new
 * MongoTemplate(mongoClient(), "MYDB"); // }
 * 
 * 
 * 
 * 
 * 
 * @Primary
 * 
 * @Bean(name = "entityManagerFactory") public
 * LocalContainerEntityManagerFactoryBean
 * entityManagerFactory(EntityManagerFactoryBuilder builder,
 * 
 * @Qualifier("dataSource") DataSource dataSource) {
 * 
 * HashMap<String, Object> properties = new HashMap<>();
 * properties.put("hibernate.hbm2ddl.auto", "update");
 * 
 * return builder.dataSource(dataSource) .properties(properties)
 * .packages("com.naveen.db1.entity") .persistenceUnit("db1") .build(); }
 * 
 * 
 * @Primary
 * 
 * @Bean(name = "transactionManager") public PlatformTransactionManager
 * transactionManager(@Qualifier("entityManagerFactory") EntityManagerFactory
 * entityManagerFactory) { return new
 * JpaTransactionManager(entityManagerFactory); } }
 */
