package com.naveen.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {

	@GetMapping("/welcome")
	public ResponseEntity<String> getWelcomeMsg(
			@RequestParam("name") String name) {
		
		String respPayload = name + ", Welcome to ABC IT";
		
		return new ResponseEntity<>(respPayload, HttpStatus.OK);
	}

	@GetMapping("/greet")
	public String getGreetMsg() {

		String respPayload = "Good Morning..!!";

		return respPayload;
	}

}
