package com.naveen.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.naveen.entity.Customer;
import com.naveen.repo.CustomerRepository;
import com.naveen.service.CustomerService;
import com.naveen.service.JwtService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api")
public class CustomerRestController {

	@Autowired
	private JwtService jwtService;

	@Autowired
	private AuthenticationManager authManager;

	@Autowired
	private CustomerService customerService;

	@GetMapping("/welcome")
	public String welcome() {
		return "welcome, you came here by validating JWT Token..!";
	}

	@PostMapping("/login")
	public ResponseEntity<String> loginCustomer(@RequestBody Customer customer) {

		UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(customer.getName(),
				customer.getPwd());

		// verify loign details valid or not
		Authentication authenticate = authManager.authenticate(token);

		boolean status = authenticate.isAuthenticated();

		if (status) {

			String jwtToken = jwtService.generateToken(customer.getName());
			log.info("Exiting loginCheck() method : ");
			return new ResponseEntity<>(jwtToken, HttpStatus.OK);

		} else {
			return new ResponseEntity<>("Invalid Credentials", HttpStatus.BAD_REQUEST);
		}

	}

	@PostMapping("/register")
	public ResponseEntity<String> registerCustomer(@RequestBody Customer customer) {

		log.info("Entering into registerCustomer() method : ");
		boolean status = customerService.saveCustome(customer);
		if (status) {
			return new ResponseEntity<>("Customer Registered Success", HttpStatus.CREATED);
		} else {
			return new ResponseEntity<>("Customer Registration Failed", HttpStatus.INTERNAL_SERVER_ERROR);

		}

	}

}
