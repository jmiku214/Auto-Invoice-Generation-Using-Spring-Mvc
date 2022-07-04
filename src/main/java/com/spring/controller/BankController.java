package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.dto.BankDto;
import com.spring.service.BankService;

@RestController
public class BankController {
	
	@Autowired
	private BankService bankService;

	@GetMapping("/banklist")
	public ResponseEntity<List<BankDto>> getBanks()
	{
		List<BankDto> banks=bankService.getBank();
		return new ResponseEntity<List<BankDto>>(banks,HttpStatus.OK);
	}
}
