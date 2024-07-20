package com.naveen.controllere;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {

	@GetMapping("/")
	public String getWelcomeMst(Model model) {
		
		
		model.addAttribute("msg", "welcome to ABC IT");
		
		return "index";
	}
}
