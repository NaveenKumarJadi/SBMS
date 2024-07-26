package com.naveen;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.naveen.entity.OrderDetailsEntity;
import com.naveen.repository.OrderDetailsRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt = SpringApplication.run(Application.class, args);
	
		OrderDetailsRepository bean = ctxt.getBean(OrderDetailsRepository.class);
		
		OrderDetailsEntity entity = new OrderDetailsEntity();
		entity.setOrderBy("Ram");
		entity.setOrderPlacedDate(new Date());
		
		OrderDetailsEntity savedEntity = bean.save(entity);
		
		System.out.println(savedEntity);
		
		ctxt.close();
	}

}
