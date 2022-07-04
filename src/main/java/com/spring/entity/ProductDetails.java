package com.spring.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "product_details")
public class ProductDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "product_name")
	private String productName;

	@Column(name = "productDesc")
	private String productDesc;
	
	@Column(name = "hsnCode")
	private String hsncode;
	
	@Column(name = "quantity")
	private double quantity;
	
	@Column(name = "price_per_unit")
	private double price_per_unit;
	
	@Column(name = "start_on")
	private String startOn;
	
	@Column(name = "end_on")
	private String endOn;
	
	@Column(name = "repeat_every")
	private String repeatEvery;
	
	@Column(name = "bill_generated_date")
	@JsonFormat(pattern = "yyyy-mm-dd")
	private Date billGeneratedDate;
	
	@ManyToOne
	private CustomerDetails customerDetails;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	
	public String getProductDesc() {
		return productDesc;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

	
	public String getHsncode() {
		return hsncode;
	}

	public void setHsncode(String hsncode) {
		this.hsncode = hsncode;
	}

	

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public double getPrice_per_unit() {
		return price_per_unit;
	}

	public void setPrice_per_unit(double price_per_unit) {
		this.price_per_unit = price_per_unit;
	}

	public String getStartOn() {
		return startOn;
	}

	public void setStartOn(String startOn) {
		this.startOn = startOn;
	}

	public String getEndOn() {
		return endOn;
	}

	public void setEndOn(String endOn) {
		this.endOn = endOn;
	}

	public String getRepeatEvery() {
		return repeatEvery;
	}

	public void setRepeatEvery(String repeatEvery) {
		this.repeatEvery = repeatEvery;
	}

	public Date getBillGeneratedDate() {
		return billGeneratedDate;
	}

	public void setBillGeneratedDate(Date billGeneratedDate) {
		this.billGeneratedDate = billGeneratedDate;
	}

	public ProductDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
