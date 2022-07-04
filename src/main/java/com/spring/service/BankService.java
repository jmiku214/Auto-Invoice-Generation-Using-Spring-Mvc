package com.spring.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.dto.BankDto;
import com.spring.entity.Bank;


@Service
public interface BankService {

	public List<BankDto> getBank();
	BankDto entityToDto(Bank bank);
}
