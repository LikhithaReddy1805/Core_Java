package com.tnsif.constructor;

public class Customer {
	
	private String customerName;
	private String customerCity;
	private int customerId;
	
	public Customer() {
		this.customerName="Alexa";
		this.customerCity="World";
		this.customerId=1;
	}
	
	
	public Customer(String customerName, String customerCity, int customerId) {
		this.customerName = customerName;
		this.customerCity = customerCity;
		this.customerId = customerId;
	}


	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerCity() {
		return customerCity;
	}
	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	
	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", customerCity=" + customerCity + ", customerId="
				+ customerId + "]";
	}
}