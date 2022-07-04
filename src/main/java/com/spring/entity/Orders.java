package com.spring.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class Orders {

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@OneToOne(cascade = {CascadeType.ALL})
	private CustomerDetails customerDetails;
	
	@OneToOne(cascade = {CascadeType.ALL})
	private ProductDetails productDetails;
	
	@OneToOne(cascade = {CascadeType.ALL})
	private AccountHolderDetails accountHolderDetails;
	
	@OneToOne(cascade = {CascadeType.ALL})
	private Bank bank;
	
	@OneToOne(cascade = {CascadeType.ALL})
	private Ifsc ifsc;

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	
	public CustomerDetails getCustomerDetails() {
		return customerDetails;
	}
	public void setCustomerDetails(CustomerDetails customerDetails) {
		this.customerDetails = customerDetails;
	}
	public ProductDetails getProductDetails() {
		return productDetails;
	}
	public void setProductDetails(ProductDetails productDetails) {
		this.productDetails = productDetails;
	}
	public AccountHolderDetails getAccountHolderDetails() {
		return accountHolderDetails;
	}
	public void setAccountHolderDetails(AccountHolderDetails accountHolderDetails) {
		this.accountHolderDetails = accountHolderDetails;
	}
	
	public Bank getBank() {
		return bank;
	}
	public void setBank(Bank bank) {
		this.bank = bank;
	}
	public Ifsc getIfsc() {
		return ifsc;
	}
	public void setIfsc(Ifsc ifsc) {
		this.ifsc = ifsc;
	}
	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}

}
