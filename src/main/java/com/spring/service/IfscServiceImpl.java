package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.spring.entity.Ifsc;
import com.spring.repository.IfscRepository;

@Component
public class IfscServiceImpl implements IfscService {

	@Autowired
	private IfscRepository ifscRepository;
	@Override
	@Transactional
	public List<Ifsc> getAllIfsc(String bankName) {
		// TODO Auto-generated method stub
		return ifscRepository.findByBankNameLike(bankName);
	}

}
