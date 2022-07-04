package com.spring.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "transaction")
public class Transaction {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "invoice_no")
	private String invoiceNo;

	@Column(name = "quantity")
	private int quantity;

	@Column(name = "price_per_unit")
	private int pricePerUnit;

    @JsonFormat(pattern="yyyy-MM-dd")
	@Column(name = "invoice_date")
	private Date invoiceDate;

	@Column(name = "units")
	private int units;

	@Column(name = "total_number_of_invoices")
	private int totalNumberOfInvoices;

	@Column(name = "total_amount")
	private int totalAmount;

	@Column(name = "amount_paid")
	private int amountPaid;

	@Column(name = "pending_amount")
	private int pendingAmount;
	
	@Column(name = "total_number_of_invoice")
	private int totalNumberOfInvoice;
	
	@Column(name = "total_device_amount")
	private long totalDeviceAmount;
	
	@Column(name = "total_device_received_amount")
	private long totalDeviceReceivedAmount;
	
	@Column(name = "total_device_pending_amount")
	private long totalDevicePendingdAmount;
	
	@Column(name = "total_customer_amount")
	private long totalCustomerAmount;
	
	@Column(name = "total_customer_received_amount")
	private long totalCustomerReceivedAmount;
	
	@Column(name = "total_customer_pending_amount")
	private long totalCustomerPendingdAmount;

	// FOREIGN KEY customer_details(id)
	@OneToOne
	private CustomerDetails customerDetails;

	// FOREIGN KEY product_details(id)
	@OneToOne
	private ProductDetails productDetails;

	// FOREIGN KEY orders(id)
	@OneToOne
	private Orders orders;

	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

	public String getInvoiceNo() {
		return invoiceNo;
	}

	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getPricePerUnit() {
		return pricePerUnit;
	}

	public void setPricePerUnit(int pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}

	public Date getInvoiceDate() {
		return invoiceDate;
	}

	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public int getUnits() {
		return units;
	}

	public void setUnits(int units) {
		this.units = units;
	}

	public int getTotalNumberOfInvoices() {
		return totalNumberOfInvoices;
	}

	public void setTotalNumberOfInvoices(int totalNumberOfInvoices) {
		this.totalNumberOfInvoices = totalNumberOfInvoices;
	}

	public int getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}

	public int getAmountPaid() {
		return amountPaid;
	}

	public void setAmountPaid(int amountPaid) {
		this.amountPaid = amountPaid;
	}

	public int getPendingAmount() {
		return pendingAmount;
	}

	public void setPendingAmount(int pendingAmount) {
		this.pendingAmount = pendingAmount;
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

	public Orders getOrders() {
		return orders;
	}

	public void setOrders(Orders orders) {
		this.orders = orders;
	}

	public int getTotalNumberOfInvoice() {
		return totalNumberOfInvoice;
	}

	public void setTotalNumberOfInvoice(int totalNumberOfInvoice) {
		this.totalNumberOfInvoice = totalNumberOfInvoice;
	}

	public long getTotalDeviceAmount() {
		return totalDeviceAmount;
	}

	public void setTotalDeviceAmount(long totalDeviceAmount) {
		this.totalDeviceAmount = totalDeviceAmount;
	}

	public long getTotalDeviceReceivedAmount() {
		return totalDeviceReceivedAmount;
	}

	public void setTotalDeviceReceivedAmount(long totalDeviceReceivedAmount) {
		this.totalDeviceReceivedAmount = totalDeviceReceivedAmount;
	}

	public long getTotalDevicePendingdAmount() {
		return totalDevicePendingdAmount;
	}

	public void setTotalDevicePendingdAmount(long totalDevicePendingdAmount) {
		this.totalDevicePendingdAmount = totalDevicePendingdAmount;
	}

	public long getTotalCustomerAmount() {
		return totalCustomerAmount;
	}

	public void setTotalCustomerAmount(long totalCustomerAmount) {
		this.totalCustomerAmount = totalCustomerAmount;
	}

	public long getTotalCustomerReceivedAmount() {
		return totalCustomerReceivedAmount;
	}

	public void setTotalCustomerReceivedAmount(long totalCustomerReceivedAmount) {
		this.totalCustomerReceivedAmount = totalCustomerReceivedAmount;
	}

	public long getTotalCustomerPendingdAmount() {
		return totalCustomerPendingdAmount;
	}

	public void setTotalCustomerPendingdAmount(long totalCustomerPendingdAmount) {
		this.totalCustomerPendingdAmount = totalCustomerPendingdAmount;
	}

	

}
