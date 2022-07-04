package com.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.entity.AccountHolderDetails;
import com.spring.entity.Orders;
import com.spring.repository.AccountHolderDetailsRepository;
import com.spring.repository.OrderRepository;

@Component
public class OrdersServiceImpl implements OrderService {

	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private AccountHolderDetailsRepository acc;
	
	@Override
	public Orders saveAllProduct(Orders order) {
		AccountHolderDetails accountHolderDetails =new AccountHolderDetails();
		accountHolderDetails.setBank(order.getBank());
		return orderRepository.save(order);
	}

}
