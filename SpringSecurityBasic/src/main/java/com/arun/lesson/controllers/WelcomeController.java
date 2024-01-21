package com.arun.lesson.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@GetMapping("/welcome")
	public String welcomeMessage() {
		return "Welcome to spring boot with security";
	}
	
	
}
