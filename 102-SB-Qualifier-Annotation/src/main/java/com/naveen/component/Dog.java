package com.naveen.component;

import org.springframework.stereotype.Component;

import com.naveen.repo.Animal;

@Component
public class Dog implements Animal {
   
	@Override
    public String speak() {
        return "Woof!";
    }
}
