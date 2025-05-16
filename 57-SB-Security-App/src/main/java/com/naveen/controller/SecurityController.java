package com.naveen.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {

	@GetMapping("/welcome")
	public String welcome() {
		return "welcome to Ayodhya";
	}

	@GetMapping("/timesheet")
	public String timesheet() {
		return "Fill the today TimeSheet";
	}

	@GetMapping("/contact")
	public String contact() {
		return "Thanks for approaching me!";
	}
}
