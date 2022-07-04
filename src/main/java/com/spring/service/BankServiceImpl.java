package com.spring.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.dto.BankDto;
import com.spring.entity.Bank;
import com.spring.repository.BankRepository;

@Component
public class BankServiceImpl implements BankService {

	@Autowired
	private BankRepository bankRepository;
	
	@Override
	public BankDto entityToDto(Bank bank) {
		BankDto bankDto=new BankDto();
		bankDto.setBankName(bank.getBankName());
		return bankDto;
	}
	@Override
	public List<BankDto> getBank() {
		
		return bankRepository.findAll().stream().map(this::entityToDto).collect(Collectors.toList());
	}

	

}
