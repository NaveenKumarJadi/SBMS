package com.naveen;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.naveen.entity.User;
import com.naveen.repository.UserRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		UserRepository repository = context.getBean(UserRepository.class);

		List<User> users = repository.getAllUsersHql();
		users.forEach(user -> {
			System.out.println(user);
		});
		
		
		System.out.println("###################################################");
		
		users = repository.getAllUsersSql();
		users.forEach(user -> {
			System.out.println(user);
		});

		
		System.out.println("###################################################");
		
		users = repository.getAllUsersByCountry("India");
		users.forEach(user -> {
			System.out.println(user);
		});
		
		
		System.out.println("###################################################");
		
		users = repository.getAllUsersByCountryAndAge("India", 25);
		users.forEach(user -> {
			System.out.println(user);
		});
	}

}
