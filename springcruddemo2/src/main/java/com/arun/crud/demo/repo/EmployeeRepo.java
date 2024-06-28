package com.arun.crud.demo.repo;

import org.springframework.data.repository.CrudRepository;

import com.arun.crud.demo.entity.Employee;

public interface EmployeeRepo extends CrudRepository<Employee, Long> {

}
