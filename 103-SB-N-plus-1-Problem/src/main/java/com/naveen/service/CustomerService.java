package com.naveen.service;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import com.naveen.entity.Customer;
import com.naveen.repo.CustomerRepository;

import java.util.List;

@Service
public class CustomerService {

	private final CustomerRepository customerRepository;

	public CustomerService(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	@Transactional
	public Customer saveCustomer(Customer customer) {
		if (customer.getAddresses() != null) {
			customer.getAddresses().forEach(address -> address.setCustomer(customer));
		}
		return customerRepository.save(customer);
	}

	public Customer getCustomer(Long id) {
		Customer customer = customerRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Exception occurred while fetching customer : " + id));
		return customer;
		
	}

	public List<Customer> getAllCustomers() {
		return customerRepository.findAll();
	}
	
	public List<Customer> getAllCustomersWithAddress() {
		return customerRepository.fetchCustomersWithAddress();
	}
}