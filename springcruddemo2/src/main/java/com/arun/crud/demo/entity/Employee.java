package com.arun.crud.demo.entity;

import org.hibernate.validator.constraints.Length;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="employee_info")
@Data
public class Employee {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@Column(name="name")
	@Length(min=4,message="minimum 4 characters should be present")
	private String name;
	
	@Column(name="department")
	private String dept;
	
	@Column(name="salary")
	private double salary;	
	
}
