package com.naveen.service;

import org.springframework.stereotype.Service;

import com.naveen.repo.GreetingService;

@Service
public class EnglishGreetingService implements GreetingService {
	
	@Override
	public String greet() {
		return "Hello, this is from EnglishGreetingService!";
	}
	
}
