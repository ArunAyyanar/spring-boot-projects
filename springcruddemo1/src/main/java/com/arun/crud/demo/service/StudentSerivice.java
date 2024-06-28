package com.arun.crud.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arun.crud.demo.entity.Student;
import com.arun.crud.demo.repo.StudentRepo;

@Service
public class StudentSerivice {

	
	
	@Autowired
	private StudentRepo repo;
	
	public Student addStudent(Student student) {
		
		return repo.save(student);
		
		
	}
	
}
