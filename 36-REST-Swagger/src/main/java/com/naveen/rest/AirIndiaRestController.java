package com.naveen.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.naveen.request.PassengerInfo;
import com.naveen.response.TicketInfo;

@RestController
public class AirIndiaRestController {

	@PostMapping(
			value = "/bookFlightTicket", 
			consumes = { "application/json", "application/xml" }, 
			produces = { "application/json", "application/xml" }
			)
	public ResponseEntity<TicketInfo> bookTicket(@RequestBody PassengerInfo pinfo) {

		// logic to book ticket

		// send ticket information

		TicketInfo ticket = new TicketInfo();
		ticket.setName(pinfo.getFname() + " " + pinfo.getLname());
		ticket.setFrom(pinfo.getFrom());
		ticket.setTo(pinfo.getTo());
		ticket.setFlightId(pinfo.getFlightId());
		ticket.setTicketStatus("CONFIRMED");
		ticket.setTicketPrice("4500.00 INR");
		ticket.setJourneyDate(pinfo.getJourneyDate());

		return new ResponseEntity<TicketInfo>(ticket, HttpStatus.CREATED);
	}
}
