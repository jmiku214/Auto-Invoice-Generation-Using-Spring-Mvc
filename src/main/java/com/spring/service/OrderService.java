package com.spring.service;

import org.springframework.stereotype.Service;

import com.spring.entity.Orders;

@Service
public interface OrderService {

	public Orders saveAllProduct(Orders order);
}
