package com.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.entity.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Integer> {

}
