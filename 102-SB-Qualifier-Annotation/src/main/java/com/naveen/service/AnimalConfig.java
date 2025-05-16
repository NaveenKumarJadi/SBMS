package com.naveen.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.naveen.component.Cat;
import com.naveen.component.Dog;
import com.naveen.repo.Animal;

@Configuration
public class AnimalConfig {

	@Bean(name = "dogBean")
	public Animal dog() {
		return new Dog();
	}

	@Bean(name = "catBean")
	public Animal cat() {
		return new Cat();
	}
}
