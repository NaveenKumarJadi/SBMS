package com.naveen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.naveen.entity.Product;
import com.naveen.repository.ProductRepository;

@SpringBootApplication
public class Application implements CommandLineRunner{

	@Autowired
	private ProductRepository productRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
		Product product = new Product();
		product.setName("Ragava");
		product.setDescription("Customer Names Table");
		
		Product saveProduct = productRepository.save(product);
		
		System.out.println(saveProduct);
	}

}
