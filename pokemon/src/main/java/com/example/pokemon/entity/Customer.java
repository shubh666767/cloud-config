package com.example.pokemon.entity;

import org.springframework.hateoas.RepresentationModel;

public class Customer extends RepresentationModel<Customer>{

	private String customerId;
    private String customerName;
    private String companyName;
	public Customer(String customerId, String customerName, String companyName) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.companyName = companyName;
	
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
    
    
    
}
