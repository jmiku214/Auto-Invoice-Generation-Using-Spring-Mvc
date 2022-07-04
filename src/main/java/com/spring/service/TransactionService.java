package com.spring.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.entity.Transaction;

@Service
public interface TransactionService {

	public List<Transaction> getTransaction();
}
