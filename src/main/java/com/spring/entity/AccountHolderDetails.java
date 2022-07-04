package com.spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "account_holder")
public class AccountHolderDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "accountNumber")
	private String accountNumber;
	
	@Column(name = "holderName")
	private String accountHolderName;
	
    @OneToOne
    private Bank bank;

	@OneToOne
	private Ifsc ifsc;
	
	
	@ManyToOne
	private CustomerDetails customerDetails;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
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
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	
	public AccountHolderDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
