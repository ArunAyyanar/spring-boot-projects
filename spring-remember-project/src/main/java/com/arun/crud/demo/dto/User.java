package com.arun.crud.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class User {

	@JsonProperty("first_Name")
	private String firstName;
	private int age;
	private String place;
	
}
