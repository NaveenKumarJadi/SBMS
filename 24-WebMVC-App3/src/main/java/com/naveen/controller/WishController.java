package com.naveen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


//@Controller
@RestController
public class WishController {

//	Approach-3: To send the data from controller to UI
	@GetMapping("/wish")
//	@ResponseBody
	public String getWish() {
		
		String msg = "All the best.!!";
		
		return msg;  //returning direct response
	}
}
