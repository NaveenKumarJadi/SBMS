package com.naveen;

import java.util.List;

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

		/*List<User> findbycountry = repository.findByCountry("INDIA");	
		findbycountry.forEach(user -> {
			System.out.println(user);
		});*/
		
		/*List<User> findByAge = repository.findByAge(30);
		
		findByAge.forEach(user -> {
			System.out.println(user);
		});*/
		
		
		/*List<User> list = repository.findByAgeGreaterThanEqual(30);
		
		list.forEach(user -> {
			System.out.println(user);
		});*/
		
		/*List<User> list = repository.findByCountryIn(Arrays.asList("INDIA", "USA"));
		
		list.forEach(user -> {
			System.out.println(user);
		});*/

		
		/*List<User> list = repository.findByCountryAndAge("INDIA", 25);
		
		list.forEach(user -> {
			System.out.println(user);
		});*/
		
		
		List<User> list = repository.findByCountryAndAgeAndGender("INDIA", 25, "Male");
		
		list.forEach(user -> {
			System.out.println(user);
		});	
	}


}
