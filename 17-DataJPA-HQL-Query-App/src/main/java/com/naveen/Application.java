package com.naveen;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.naveen.entity.User;
import com.naveen.repository.UserRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		UserRepository repository = context.getBean(UserRepository.class);

		/*User u5 = new User(105, "Ganesh", "Male", 33, "India");
		User u6 = new User(106, "Orlen", "Male", 34, "Germany");
		User u7 = new User(107, "Charles", "Male", 35, "Mexico");
		User u8 = new User(108, "Buttler", "Male", 36, "Australia");
		User u9 = new User(109, "Cathy", "Fe-Male", 29, "USA");
		User u10 = new User(110, "Tanny", "Fe-Male", 28, "Canada");
		
		repository.saveAll(Arrays.asList(u5, u6, u7, u8, u9, u10));*/
		
/*		
//		Sorting
//		List<User> users = repository.findAll();
//		List<User> users = repository.findAll(Sort.by("age").ascending());
		List<User> users = repository.findAll(Sort.by("username", "age").descending());
		
		users.forEach(user ->{
			System.out.println(user);
		});
*/

/*
		
//		Pagenation
		
		int pageSize = 5;
		int pageNo = 1;
		
		PageRequest pageRequest = PageRequest.of(pageNo-1, pageSize);
		Page<User> pageData = repository.findAll(pageRequest);
		
		int totalPages = pageData.getTotalPages();
		System.out.println("Total Pages :: " + totalPages);
		
		List<User> users = pageData.getContent();
		
		users.forEach(user ->{
			System.out.println(user);
		});
*/	
		
		//QBE - Query by Example
		
		User entity = new User();
				
		entity.setCountry("India");	//set it if required
		entity.setAge(25);			//set it if required
		
		Example<User> example = Example.of(entity);
		List<User> users = repository.findAll(example);
		
		
		users.forEach(user ->{
			System.out.println(user);
		});
		
		
//		Possible combination
//		repository.findAll(example, sort);
//		repository.findAll(example, pageable);
		
		
	}

}
