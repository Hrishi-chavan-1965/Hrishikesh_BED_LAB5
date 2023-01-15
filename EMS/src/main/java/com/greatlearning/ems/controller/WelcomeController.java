package com.greatlearning.ems.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
	
	@RequestMapping("/welcome")
	public String showWelcomePage() {
		
		return "welcome-page";
		
	}

}