package com.arun.crud.demo.repo;

import org.springframework.data.repository.CrudRepository;

import com.arun.crud.demo.entity.Student;

public interface StudentRepo extends CrudRepository<Student,Long> {

}
