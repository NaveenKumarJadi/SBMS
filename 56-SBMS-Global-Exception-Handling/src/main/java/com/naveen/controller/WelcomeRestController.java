package com.naveen.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {

	private Logger logger = LoggerFactory.getLogger(WelcomeRestController.class);

	@GetMapping("/welcome")
	public String welcome() {

		String msg = "Welcome to ABC IT";

		try {
			int i = 10 / 0;

		} catch (Exception e) {
			logger.error("Exception Occured: " + e, e);
			throw new ArithmeticException(e.getMessage());
		}
		return msg;
	}
}
