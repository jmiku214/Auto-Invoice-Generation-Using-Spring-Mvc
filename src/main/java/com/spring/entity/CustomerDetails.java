package com.spring.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="customer_details")
public class CustomerDetails {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "customerName")
	private String customerName;

	@Column(name = "gstNumber")
	private String gstNumber;

	@Column(name = "address")
	private String customerAddress;

	@Column(name = "email")
	private String emailId;
	
	@JsonIgnore
	@OneToMany(mappedBy = "customerDetails",cascade = CascadeType.ALL)
	private List<ProductDetails> productDetails;

	@JsonIgnore
	@OneToMany(mappedBy = "customerDetails",cascade = CascadeType.ALL)
	private List<AccountHolderDetails> accountHolderDetails;
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	
	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	
	public String getGstNumber() {
		return gstNumber;
	}

	public void setGstNumber(String gstNumber) {
		this.gstNumber = gstNumber;
	}

	
	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	
	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public CustomerDetails(Long id, String customerName, String gstNumber, String customerAddress, String emailId) {
		super();
		this.id = id;
		this.customerName = customerName;
		this.gstNumber = gstNumber;
		this.customerAddress = customerAddress;
		this.emailId = emailId;
	}

	public CustomerDetails() {
		super();
		// TODO Auto-generated constructor stub
	}	
	
	
}
