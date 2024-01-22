package com.eazy.lesson.model;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Customer {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="native")
	@GenericGenerator(name="native")
	private int id;
	
	private String email;
	
	private String pwd;
	
	private String role;
	
}


