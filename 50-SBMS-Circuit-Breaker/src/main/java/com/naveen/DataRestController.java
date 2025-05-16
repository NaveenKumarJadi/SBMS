package com.naveen;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class DataRestController {

	private static final String SERVICE_NAME = "redisService";

	@GetMapping("/data")
	@CircuitBreaker(name = SERVICE_NAME, fallbackMethod = "getDataFromDB")
	public String getDataFromRedis() {
		System.out.println("*** Redis() method called ***");

		// Simulate failure
		if (new Random().nextInt(10) < 9) { // 80% chance of failure
			throw new RuntimeException("Redis is down!");
		}

		return "✅ Data accessed from Redis (main logic)";
	}

	// Fallback method must match signature
	public String getDataFromDB(Throwable t) {
		System.out.println("*** Fallback DB() method called ***");
		return "⚠️ Redis failed. Data accessed from DB (fallback)";
	}
}
