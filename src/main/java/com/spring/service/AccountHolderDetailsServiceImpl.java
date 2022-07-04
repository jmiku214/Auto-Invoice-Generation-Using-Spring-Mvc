package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.spring.entity.AccountHolderDetails;
import com.spring.repository.AccountHolderDetailsRepository;



@Component
public class AccountHolderDetailsServiceImpl implements AccountHolderDetailsService {

	@Autowired
	private AccountHolderDetailsRepository accountHolderDetailsRepository;
	@Override
	@Transactional
	public List<AccountHolderDetails> getByBankName(String bankName) {
		// TODO Auto-generated method stub
		return accountHolderDetailsRepository.findByBankName(bankName);
	}

}
