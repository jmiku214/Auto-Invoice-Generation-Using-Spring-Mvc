package com.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.entity.Orders;

public interface OrderRepository extends JpaRepository<Orders, Integer> {

}
