package com.spring.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.entity.EmailRequest;

@Service
public interface EmailRequestService {

	public List<EmailRequest> list();
	void sendEmail(String toEmail, String subject, String body,String pdfPath);
}
