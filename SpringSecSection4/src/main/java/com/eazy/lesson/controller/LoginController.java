package com.eazy.lesson.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.eazy.lesson.model.Customer;
import com.eazy.lesson.repository.CustomerRepository;

@RestController
public class LoginController {

	@Autowired
	private CustomerRepository customerRepo;
	
	@Autowired
	private PasswordEncoder passEncoder;

	@PostMapping("/register")
	public ResponseEntity<String> registerNewUser(@RequestBody Customer customer) {

		Customer registeredCustomer = null;
		ResponseEntity<String> responseEntity = null;
		try {
			String hashPwd = passEncoder.encode(customer.getPwd());
			customer.setPwd(hashPwd);
			registeredCustomer = customerRepo.save(customer);
			if(registeredCustomer.getId()>0) {
				responseEntity = ResponseEntity.status(HttpStatus.CREATED)
						.body("Customer registered successfully");
			}
		} catch (Exception e) {
			responseEntity = ResponseEntity.status(HttpStatus.BAD_REQUEST)
					.body("Erro while registering new customer :: "+e.getLocalizedMessage());
		}

		return responseEntity;
	}

}
