package com.eazy.lesson.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

	@GetMapping("/account")
	public String accountPage() {
		return "Account page is loading";
	}
	
}
