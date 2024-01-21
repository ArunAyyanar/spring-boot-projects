package com.eazy.lesson.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoticesController {

	@GetMapping("/notice")
	public String loadDetails() {
		return "Returning notices details from DB";
	}
}
