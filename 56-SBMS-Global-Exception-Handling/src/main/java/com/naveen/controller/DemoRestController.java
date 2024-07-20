package com.naveen.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {

	private Logger logger = LoggerFactory.getLogger(DemoRestController.class);

	@GetMapping("/demo")
	public String doAction() {

		String msg = "Action in progress";

		try {
			int i = 10 / 0;

		} catch (Exception e) {
//			logger.error("Exception Occured: " + e.getMessage());
			logger.error("Exception Occured: " + e, e);
			throw new ArithmeticException(e.getMessage());
		}
		return msg;
	}

}