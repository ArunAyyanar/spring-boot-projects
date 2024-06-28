package com.arun.crud.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arun.crud.demo.entity.Employee;
import com.arun.crud.demo.service.EmployeeService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api")
public class EmployeeController {

	@Autowired
	private EmployeeService service;
	
	@PostMapping("/employee")
	public Employee saveEmployee(@RequestBody @Valid Employee employee) {		
		
		return service.storeEmployeeDetails(employee);
	}
	
	@GetMapping("/employee/{id}")
	public Employee findEmployee(@PathVariable("id") long id) {
		return service.findEmployee(id);
	}
	
	@DeleteMapping("/employee/{id}")
	public String removeEmployee(@PathVariable("id") long id) {
		return service.deleteEmployee(id);
	}
	
	@PutMapping("/employee")
	public Employee updateEmployee(@RequestBody Employee employee) {
		return service.updateEmployee(employee);
	}
	
	@GetMapping("/employee")
	public List<Employee> getAllEmployees(){
		return service.allEmployees();
	}
	
}
