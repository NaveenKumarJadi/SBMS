package com.naveen.rest;

import java.time.Duration;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.naveen.binding.CustomerEvent;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.util.function.Tuple2;

@RestController
public class CustomerRestController {

	@GetMapping(value = "/event", produces = "application/json")
	public ResponseEntity<Mono<CustomerEvent>> getEvent() {

		CustomerEvent event = new CustomerEvent("Navin", new Date());

		Mono<CustomerEvent> customerMono = Mono.just(event);

		return new ResponseEntity<Mono<CustomerEvent>>(customerMono, HttpStatus.OK);

	}

	@GetMapping(value = "/events", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
	public ResponseEntity<Flux<CustomerEvent>> getEvents() {

		// creating binding object with data
		CustomerEvent event = new CustomerEvent("Navin", new Date());

		// creating stream for binding object
		Stream<CustomerEvent> customerStream = Stream.generate(() -> event);

		// creating flux object using stream
		Flux<CustomerEvent> cFlux = Flux.fromStream(customerStream);

		// setting response interval
		Flux<Long> intervalFlux = Flux.interval(Duration.ofSeconds(5));

		// combine interval flux and customer event flux
		Flux<Tuple2<Long, CustomerEvent>> zip = Flux.zip(intervalFlux, cFlux);

		// Getting Tuple value as T2
		Flux<CustomerEvent> fluxMap = zip.map(Tuple2::getT2);

		// sending response
		return new ResponseEntity<>(fluxMap, HttpStatus.OK);

	}

	@GetMapping("/hello")
	public Mono<String> sayHello() {
		return Mono.just("👋 Hello from Mono!");
	}

	@GetMapping("/user")
	public Mono<CustomerEvent> getUser() {
		CustomerEvent event = new CustomerEvent("Navin", new Date());
		return Mono.just(event);
	}

	@GetMapping("/users")
	public Flux<CustomerEvent> getUsers() {
		List<CustomerEvent> customerEventList = Arrays.asList(new CustomerEvent("Navin", new Date()),
				new CustomerEvent("Kumar", new Date()), new CustomerEvent("Jadi", new Date()));
		return Flux.fromIterable(customerEventList);
	}

	@GetMapping("/numbers")
	public Flux<Integer> streamNumbers() {
		return Flux.range(1, 5);
	}

	@GetMapping(value = "/stream", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
	public Flux<String> streamData() {
		return Flux.interval(Duration.ofSeconds(1)).map(i -> "Streaming message #" + i);
	}

}
