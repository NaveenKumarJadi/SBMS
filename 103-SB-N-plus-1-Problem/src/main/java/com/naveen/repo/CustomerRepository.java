package com.naveen.repo;

import java.util.List;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.naveen.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

	
	//   @EntityGraph to avoid N+1 Query problem
	//   attributePaths value we have to use same what we are using in Customer
    @EntityGraph(attributePaths = "addresses")
    List<Customer> findAll();

    //   Join query to avoid N+1 Query problem
    @Query("SELECT c FROM Customer c LEFT JOIN FETCH c.addresses")
    List<Customer> fetchCustomersWithAddress();
    
}