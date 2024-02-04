package com.naveen;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.naveen.security.AppSecurity;

@Component
public class Car {

	public Car()
	{
		System.out.println("Car :: Constructor");
	}

	/*
	@Bean
	public AppSecurity createInstance()
	{
		AppSecurity as = new AppSecurity();
//		custom logic to secure our functionality
		return as;
	}
	*/
}
