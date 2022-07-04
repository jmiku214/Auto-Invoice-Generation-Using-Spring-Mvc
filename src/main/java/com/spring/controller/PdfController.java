package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.service.PdfUserGeneratorService;

@RestController
public class PdfController {

	@Autowired
	private PdfUserGeneratorService pdfUserGenerator;

	@RequestMapping(value = "/pdf", method = RequestMethod.POST)

	public ResponseEntity<?> pdfGenerator(int transactionId, String path) throws Exception {

		ResponseEntity<?> list = pdfUserGenerator.pdfGen(transactionId,path);

		return ResponseEntity.ok(list);

	}

	public PdfController() {
		super();
		// TODO Auto-generated constructor stub
	}

//	@GetMapping("/generate/pdf")
//	public ResponseEntity<CustomResponse> generatePdf(HttpServletRequest request) throws ParseException {
//		CustomResponse response = new PdfUser
//		
//		return new ResponseEntity<CustomResponse>(response, HttpStatus.OK);
//	}
	
	

}
