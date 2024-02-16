package com.udemy.lesson;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.udemy.lesson.entity.Address;
import com.udemy.lesson.repo.AddressRepository;

@SpringBootTest
public class AddressTest {

	@Autowired
	private AddressRepository addressRepo;
	
	@Test
	public void save_address() {
		
		Address address = new Address();		
		address.setStreet("royal oak");
		address.setState("PA");
		address.setZipCode("60503");
		addressRepo.save(address);
	}
}
