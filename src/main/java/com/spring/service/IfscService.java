package com.spring.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.entity.Ifsc;

@Service
public interface IfscService {

	List<Ifsc> getAllIfsc(String bankName);
}
