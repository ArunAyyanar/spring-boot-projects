package com.eazy.lesson.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {

	@GetMapping("/contact")
	public String accountPage() {
		return "Contact page is loading";
	}
	
}
