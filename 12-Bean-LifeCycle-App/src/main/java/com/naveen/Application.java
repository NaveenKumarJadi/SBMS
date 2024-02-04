package com.naveen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}


/*
output::
Engine :: Constructor
Start engine..
Motor :: Constructor
afterPropertiesSet() method called...
destroy() method called...
Stop engine
*/