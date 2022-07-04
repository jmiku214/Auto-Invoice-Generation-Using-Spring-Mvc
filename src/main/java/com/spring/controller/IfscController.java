package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.spring.entity.Ifsc;
import com.spring.service.IfscService;

@RestController
public class IfscController {
	
	@Autowired
	private IfscService ifscService;

	@GetMapping("/ifscList/{bankName}")
	public ResponseEntity<List<Ifsc>> getAllIfscList(@PathVariable String bankName)
	{
		List<Ifsc> list=ifscService.getAllIfsc(bankName);
		
		return new ResponseEntity<List<Ifsc>>(list,HttpStatus.OK);
	}
}
