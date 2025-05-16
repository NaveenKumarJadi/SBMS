package com.naveen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {

//	Approach-1: To send the data from controller to UI
	@GetMapping("/welcome")
	public ModelAndView welcomeMsg() {
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("msg", "Welcome to ABC IT..!");
		
		mav.setViewName("welcome");			// setting view name
		
		return mav;
	}
}
