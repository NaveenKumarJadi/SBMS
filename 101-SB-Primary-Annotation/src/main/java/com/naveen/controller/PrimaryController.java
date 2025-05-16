package com.naveen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.naveen.repo.GreetingService;

@RestController
@RequestMapping("/primary")
public class PrimaryController {

	@Autowired
	private GreetingService greetingService;

	@GetMapping("/component")
	public String greetings() {
		return greetingService.greet();
	}

}
