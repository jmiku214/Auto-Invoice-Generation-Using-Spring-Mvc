package com.spring.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "EmailRequest")
public class EmailRequest {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String toEmail;
	private String subject;
	private String body;
	private String pdfPath;
	
	@OneToOne
	private CustomerDetails customerDetails;
	
	@OneToOne
	private Transaction transaction;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getToEmail() {
		return toEmail;
	}

	public void setToEmail(String toEmail) {
		this.toEmail = toEmail;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getPdfPath() {
		return pdfPath;
	}

	public void setPdfPath(String pdfPath) {
		this.pdfPath = pdfPath;
	}
	

	public CustomerDetails getCustomerDetails() {
		return customerDetails;
	}

	public void setCustomerDetails(CustomerDetails customerDetails) {
		this.customerDetails = customerDetails;
	}

	public Transaction getTransaction() {
		return transaction;
	}

	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}

	public EmailRequest(int id, String toEmail, String subject, String body, String pdfPath) {
		super();
		this.id = id;
		this.toEmail = toEmail;
		this.subject = subject;
		this.body = body;
		this.pdfPath = pdfPath;
	}

	public EmailRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "EmailRequest [id=" + id + ", toEmail=" + toEmail + ", subject=" + subject + ", body=" + body
				+ ", pdfPath=" + pdfPath + "]";
	}

}
