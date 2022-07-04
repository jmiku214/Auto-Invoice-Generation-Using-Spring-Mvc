package com.spring.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.entity.CustomerDetails;

@Service
public interface CustomerDetailsService {

	public List < CustomerDetails > getCustomers();
	 List<CustomerDetails> getCustomers(String name);
	
}
