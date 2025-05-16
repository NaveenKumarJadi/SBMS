package com.naveen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.naveen.client.BookClient;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		BookClient bean = context.getBean(BookClient.class);
		
		bean.invokeSaveBook();
		
		bean.invokeGetBooksAsync();
		
//		bean.invokeGetBooks();
	}
}
