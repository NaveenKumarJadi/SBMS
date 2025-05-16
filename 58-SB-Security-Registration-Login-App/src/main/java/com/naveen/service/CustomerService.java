package com.naveen.service;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.naveen.entity.Customer;
import com.naveen.repo.CustomerRepository;

@Service
public class CustomerService implements UserDetailsService {

	@Autowired
	private BCryptPasswordEncoder pwdEncoder;

	@Autowired
	private CustomerRepository customerRepo;

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

		Customer c = customerRepo.findByEmail(email);

		return new User(c.getEmail(), c.getPwd(), Collections.emptyList());
	}

	public boolean saveCustome(Customer c) {

		String encodePwd = pwdEncoder.encode(c.getPwd());
		c.setPwd(encodePwd);

		Customer savedCustomer = customerRepo.save(c);

		return savedCustomer.getCid() != null;
	}

}
