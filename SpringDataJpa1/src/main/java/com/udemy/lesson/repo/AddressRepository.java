package com.udemy.lesson.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udemy.lesson.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
