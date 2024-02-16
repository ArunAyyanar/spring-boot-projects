package com.udemy.lesson;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.udemy.lesson.entity.Address;
import com.udemy.lesson.entity.Order;
import com.udemy.lesson.repo.OrderRepository;

@SpringBootTest
public class OneToOne_UniDirectionalTest {

	@Autowired
	private OrderRepository orderRepo;

	@Test
	public void oneToOne_mapping_save() {
		Order order = new Order();
		order.setOrderTrackingNumber("TN22");
		order.setTotalPrice(new BigDecimal(150));

		Address address = new Address();
		address.setStreet("chicago");
		address.setState("PA");
		address.setZipCode("60503");

		order.setAddress(address);

		orderRepo.save(order);
	}

	@Test
	public void oneToOne_mapping_update() {
	
			Order order = orderRepo.findById(1L).get();			

			Address address = order.getAddress();
			address.setZipCode("15220");
			order.setTotalPrice(new BigDecimal(500));

			orderRepo.save(order);
		

	}

}
