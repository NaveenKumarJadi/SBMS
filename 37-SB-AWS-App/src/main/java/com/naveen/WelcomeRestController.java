package com.naveen;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {

	@GetMapping("/")
	public String welcomeMsg() {
		return "Welcome to ABC IT";
	}
}
