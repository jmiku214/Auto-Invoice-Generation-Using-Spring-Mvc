package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.entity.Transaction;
import com.spring.repository.TransactionRepository;

@Component
public class TransactionServiceImpl implements TransactionService {

	@Autowired
	private TransactionRepository transactionRepository;
	
	@Override
	public List<Transaction> getTransaction() {
		
		return transactionRepository.findAll();
	}

}
