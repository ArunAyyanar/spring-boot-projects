package com.udemy.lesson.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.udemy.lesson.entity.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
