package com.naveen.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.naveen.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

	public Customer findByEmail(String email);
	
}
