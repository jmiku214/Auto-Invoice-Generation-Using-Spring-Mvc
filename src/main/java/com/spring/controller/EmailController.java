package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.entity.EmailRequest;
import com.spring.repository.EmailRequestRepository;
import com.spring.service.EmailRequestService;
import com.spring.service.PdfUserGeneratorService;
import com.spring.service.TransactionService;

@RestController
@Import(PdfController.class)
public class EmailController {

	@Autowired
	private EmailRequestService emailService;
	
	@Autowired
	private TransactionService transactionService;

	@Autowired
	private EmailRequestRepository email;

	@Autowired
	private PdfUserGeneratorService pdfUserGenerator;

	@Autowired
	PdfController pdfController;

	@PostMapping("/sendEmail")
//	@Scheduled(fixedDelay = 1000)
//	@Scheduled(cron = "0 */5 * * * *")
//	@Scheduled(cron = "0 00 10 1 * *")  // Run at 10:00 on 1Day day of Every month
	public ResponseEntity<?> sendEmail() {

		EmailRequest request = new EmailRequest();

//		pdfController.pdfGenerator();

		try {

			List<EmailRequest> list = emailService.list();

			for (EmailRequest i : list) {
				
				System.out.println(i.getToEmail());
				System.out.println(i.getTransaction().getId());
				
				
				pdfController.pdfGenerator(i.getTransaction().getId(),i.getPdfPath());
				
//				request.setToEmail(i.getToEmail());
//				request.setSubject(i.getSubject());
//				request.setBody(i.getBody());
//				request.setPdfPath(i.getPdfPath());
				emailService.sendEmail(i.getToEmail(), i.getSubject(), i.getBody(),
						i.getPdfPath());
				
				System.out.println(i.getToEmail());
			}

			

//			emailService.sendEmail(request.getToEmail(), request.getSubject(), request.getBody(), request.getPdfPath());

//		this.emailService.sendEmail(request);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return ResponseEntity.ok("Email Sent Sucessfully.....");
	}

	/*----------------------------------------------------------------------------------------------------------------------------------*/

	/* Code Written Bellow is Working */

	/*-------------------------------------------------*/

	@PostMapping("/send/{toEmail}/{subject}/{body}/{pdfPath}")
	public ResponseEntity<?> send(@PathVariable String toEmail, @PathVariable String subject, @PathVariable String body,
			@PathVariable String pdfPath) {

		emailService.sendEmail(toEmail, subject, body, pdfPath);

		return ResponseEntity.ok("Email Sent Sucessfully.....");

	}

	@PostMapping("/sending")
	public ResponseEntity<?> sending(@RequestParam String toEmail, @RequestParam String subject,
			@RequestParam String body, @RequestParam String pdfPath) {

		emailService.sendEmail(toEmail, subject, body, pdfPath);

		return ResponseEntity.ok("Email Sent Sucessfully.....");

	}

}

