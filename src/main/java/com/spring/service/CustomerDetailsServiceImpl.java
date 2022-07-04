package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.spring.entity.CustomerDetails;
import com.spring.repository.CustomerDetailsRepository;

@Component
public class CustomerDetailsServiceImpl implements CustomerDetailsService {

	@Autowired
	private CustomerDetailsRepository customerDetailsRepository;
	
	@Autowired
	private JavaMailSender javaMailSender;
	
	@Override
	@Transactional
	public List<CustomerDetails> getCustomers() {
		
		return customerDetailsRepository.findAll();
	}
	@Override
	@Transactional
	public List<CustomerDetails> getCustomers(String name) {
		// TODO Auto-generated method stub
		return customerDetailsRepository.getCustomers(name);
	}
	
	

}
