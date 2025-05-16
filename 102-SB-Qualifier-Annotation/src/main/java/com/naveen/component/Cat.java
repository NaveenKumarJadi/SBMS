package com.naveen.component;

import org.springframework.stereotype.Component;

import com.naveen.repo.Animal;

@Component
public class Cat implements Animal {
   
	@Override
    public String speak() {
        return "Meow!";
    }
}
