package com.naveen;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Beans.xml");
		
		Car car1 = context.getBean("car", Car.class);
		System.out.println("car1 :: " + car1.hashCode());

		Car car2 = context.getBean("car", Car.class);
		System.out.println("car2 :: " + car2.hashCode());
		
		Motor motor1 = context.getBean("motor", Motor.class);
		System.out.println("motor1 :: " + motor1.hashCode());

		Motor motor2 = context.getBean("motor", Motor.class);
		System.out.println("motor2 :: " + motor2.hashCode());
	}
}

/* 
output:
Car :: Constructor
car1 :: 1306854175
car2 :: 1306854175
Motor :: Constructor
motor1 :: 1564984895
Motor :: Constructor
motor2 :: 1587819720
*/