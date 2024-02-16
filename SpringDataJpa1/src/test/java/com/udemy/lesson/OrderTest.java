package com.udemy.lesson;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.udemy.lesson.entity.Order;
import com.udemy.lesson.repo.OrderRepository;

@SpringBootTest
public class OrderTest {

	
	@Autowired
	private OrderRepository orderRepo;
	
	@Test
	public void save_order() {
	Order order = new Order();
	order.setOrderTrackingNumber("TN11");
	order.setTotalPrice(new BigDecimal(234));
	orderRepo.save(order);
	}
}
