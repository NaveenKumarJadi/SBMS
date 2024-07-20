package com.naveen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.naveen.entity.Product;
import com.naveen.repo.ProductRepository;


@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		 ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		 
		 ProductRepository repository = context.getBean(ProductRepository.class);
		
		 Product p1 = new Product();
//		 p1.setPid(103); // we are generating  the primary key value by using @GeneratedValue annotation
		 p1.setPname("Monitor");
		 p1.setPrice(15000.00);
		 
		 repository.save(p1);
		
	}

}
