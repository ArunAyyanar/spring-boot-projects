package com.arun.crud.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arun.crud.demo.entity.Student;
import com.arun.crud.demo.service.StudentSerivice;

@RestController
@RequestMapping("/api")
public class StudentController {

	@Autowired
	private StudentSerivice service;
	
	@PostMapping("/student")
	public Student addNewStudent(@RequestBody Student student) {
		
		return service.addStudent(student);
		
	}
	
	
}
