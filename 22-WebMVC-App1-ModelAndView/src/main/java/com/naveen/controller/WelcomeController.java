package com.naveen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {

	
	@GetMapping("/welcome")
	public ModelAndView getWelcomesg()
	{
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("msg", "Welcome to My World...!");
		
		mav.setViewName("index");
		
		return mav;
	}

}
