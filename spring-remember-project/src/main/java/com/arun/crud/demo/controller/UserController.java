package com.arun.crud.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.arun.crud.demo.dto.User;

@RestController
@RequestMapping("/api/users")
public class UserController {

	
	@GetMapping
	public String getUsers() {
		return "all users";
	}
	
	@GetMapping(path="/{userId}")
	public String findUser(@PathVariable("userId") String userId,@RequestParam(value="limit",defaultValue="1") int limit,
			@RequestParam(value="sortBy",required=false) String sortBy) {
		return "finding user "+userId+" limit "+limit+ " sort by "+sortBy;
	}
	
	@PostMapping(produces= {MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<List<User>> addUser(@RequestBody User user) {
		
		return new ResponseEntity<List<User>>(Arrays.asList(user),HttpStatus.OK);
	}
	
	@PutMapping
	public String updateUser() {
		return "updating user";
	}
	
	@DeleteMapping("/{userId}")
	public String deleteUser(@PathVariable("userId") String id) {
		return "User deleted "+id;
	}
}
