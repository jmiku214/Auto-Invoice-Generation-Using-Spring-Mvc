package com.spring.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.entity.AccountHolderDetails;



@Service
public interface AccountHolderDetailsService {

	List<AccountHolderDetails> getByBankName(String bankName);
}
