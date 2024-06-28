package com.arun.crud.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arun.crud.demo.entity.Employee;
import com.arun.crud.demo.repo.EmployeeRepo;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepo repo;
	
	public Employee storeEmployeeDetails(Employee employee) {
		return repo.save(employee);
	}
	
	public Employee findEmployee(long id) {
		return repo.findById(id).get();
	}
	
	
	public String deleteEmployee(long id) {
		Employee employee = repo.findById(id).get();
		repo.delete(employee);
		return "Emp.Id :"+id+" deleted successfully";
	}
	
	public Employee updateEmployee(Employee employee) {
		return repo.save(employee);
	}
	
	
	public List<Employee> allEmployees(){
		List<Employee> empList = new ArrayList<>();
		repo.findAll().forEach(emp->{
			empList.add(emp);
		});
		return empList;
	}
}
