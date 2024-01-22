package com.eazy.lesson.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardsController {

	@GetMapping("/cards")
	public String loadDetails() {
		return "Returning cards details from DB";
	}
}
