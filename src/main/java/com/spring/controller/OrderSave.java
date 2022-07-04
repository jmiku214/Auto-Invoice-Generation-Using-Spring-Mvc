package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.entity.Orders;
import com.spring.service.OrderService;

@RestController
public class OrderSave {

	@Autowired
	private OrderService orderService;
	
	@PostMapping("/saveOrder")
	public ResponseEntity saveAllProduct(@RequestBody Orders order)
	{
		orderService.saveAllProduct(order);
		return ResponseEntity.ok(order);
	}
}
