package com.naveen.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.naveen.repo.GreetingService;

@Primary  // Spring will use this bean by default
@Service
public class SpanishGreetingService implements GreetingService {
    
	@Override
    public String greet() {
        return "Hola!";
    }
}
