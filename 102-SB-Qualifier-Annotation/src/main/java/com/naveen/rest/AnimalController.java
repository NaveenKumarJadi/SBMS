package com.naveen.rest;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.naveen.repo.Animal;

@RestController
public class AnimalController {

	private final Animal dog;
	private final Animal cat;

	public AnimalController(@Qualifier("dogBean") Animal dog, @Qualifier("catBean") Animal cat) {
		this.dog = dog;
		this.cat = cat;
	}

	@GetMapping("/dog-sound")
	public String dogSound() {
		return dog.speak(); // Output: "Woof!"
	}

	@GetMapping("/cat-sound")
	public String catSound() {
		return cat.speak(); // Output: "Meow!"
	}
}
