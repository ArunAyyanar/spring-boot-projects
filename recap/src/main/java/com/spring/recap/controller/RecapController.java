package com.spring.recap.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.recap.dto.User;

import lombok.extern.slf4j.Slf4j;



@RestController
@RequestMapping("/api")
@Slf4j
public class RecapController {

	
	@GetMapping("/users")
	public List<User> getAllUsers() {		
		
		List<User> userList = Arrays.asList(new User("Arun",30),new User("balaji",35));		
		log.info("UserList == {}",userList);
		return userList;
	}
}
