package com.naveen.rest;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.naveen.entity.Customer;
import com.naveen.service.CustomerService;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

	private final CustomerService service;

	public CustomerController(CustomerService service) {
		this.service = service;
	}

	@PostMapping
	public Customer createCustomer(@RequestBody Customer customer) {
		return service.saveCustomer(customer);
	}

	// for @EntityGraph
	@GetMapping
	public List<Customer> getCustomers() {
		return service.getAllCustomers();
	}

	// for LEFT JOIN
	@GetMapping("/address")
	public List<Customer> getCustomersWithAddress() {
		return service.getAllCustomersWithAddress();
	}
	
	// TO check Eager or Lazy loading
	@GetMapping("/customer/{id}")
	public ResponseEntity<?> getCustomer(@PathVariable Long id){
//		return ResponseEntity.ok(service.getCustomer(id));
//		return ResponseEntity.ok(service.getCustomer(id).getName());
		return ResponseEntity.ok(service.getCustomer(id).getAddresses());
		
		// lazy loading -> customer (1 query)
		// Eager loading -> customer+address (JOIN) 
		// Eager loading means even though you need 1 query it will give you all entities
	}
}
