package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.spring.entity.AccountHolderDetails;
import com.spring.service.AccountHolderDetailsService;

@RestController
public class AccountHolderDetailsController {
	
	@Autowired
	private AccountHolderDetailsService accountHolderDetailsService;

	@GetMapping("/accountHolder/search/bank/{bankName}")
	public ResponseEntity<List<AccountHolderDetails>> getAccountHolders(@PathVariable String bankName)
	{
		List<AccountHolderDetails> list=accountHolderDetailsService.getByBankName(bankName);
		return new ResponseEntity<List<AccountHolderDetails>>(list,HttpStatus.OK);
	}
}
