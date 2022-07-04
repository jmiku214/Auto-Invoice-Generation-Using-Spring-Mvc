package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.spring.entity.CustomerDetails;
import com.spring.service.CustomerDetailsService;

@RestController
public class CustomerDetailsController {

	@Autowired
	private CustomerDetailsService customerDetailsService;
	@GetMapping("/customerDetails")
	public ResponseEntity<List<CustomerDetails>> getAllCustomers()
	{
	    List<CustomerDetails> cust=customerDetailsService.getCustomers();
	    return new ResponseEntity<List<CustomerDetails>> (cust,HttpStatus.OK);
	}

	@GetMapping("/customer/search/{customerName}")
	public ResponseEntity<List<CustomerDetails>> getCustomerByName(@PathVariable String customerName)
	{
		List<CustomerDetails> customers=customerDetailsService.getCustomers(customerName);
		return new ResponseEntity<List<CustomerDetails>>(customers,HttpStatus.OK);
	}
}
