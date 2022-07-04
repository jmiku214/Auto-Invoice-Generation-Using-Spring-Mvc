package com.spring.service;

import java.io.File;
import java.util.List;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.spring.entity.CustomerDetails;
import com.spring.entity.EmailRequest;
import com.spring.repository.CustomerDetailsRepository;
import com.spring.repository.EmailRequestRepository;

@Component
public class EmailRequestServiceImpl implements EmailRequestService {

	@Autowired
	private EmailRequestRepository emailRequestRepository; 
	
	@Autowired
	private CustomerDetailsRepository customerDetailsRepository;
	
	@Autowired
	private JavaMailSender javaMailSender;
	@Override
	@Transactional
	public List<EmailRequest> list() {
		
		return emailRequestRepository.findAll();
	}
	@Override
	@Transactional
	public void sendEmail(String toEmail, String subject, String body,String pdfPath) {
		String from = "rapidsoft04@gmail.com";
		String host = "smtp.gmail.com";
		Properties properties = System.getProperties();
		properties.put("mail.smtp.host", host);
		properties.put("mail.smtp.port", "587");
		properties.put("mail.smtp.ssl.enable", "true");
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.ssl.protocols", "TLSv1.2");

		Session session = Session.getInstance(properties, new Authenticator() {

			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("rapidsoft04@gmail.com", "Miku@750478");
			}
		});

		session.setDebug(true);

		MimeMessage m = new MimeMessage(session);

		javaMailSender.send(new MimeMessagePreparator() {

			@Override
			@Transactional
			public void prepare(MimeMessage mimeMessage) throws Exception {
				MimeMessageHelper message = new MimeMessageHelper(mimeMessage, true, "UTF-8");
				EmailRequest req = new EmailRequest();
				message.setFrom(from);
				message.setTo(toEmail);
				message.setSubject(subject);
				message.setText(body, true);
				message.addAttachment("Invoice.pdf", new File(pdfPath));

			}
		});

//		try {
//			m.setFrom(from);
//			m.addRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
//			m.setSubject(body);
//			m.setText(subject);
//			Transport.send(m);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

	}

		
	}


