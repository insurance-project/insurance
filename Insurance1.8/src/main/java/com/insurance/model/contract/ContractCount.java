package com.insurance.model.contract;

public class ContractCount{
	
	private int customerID;
	private String customerName;
	private int customerAge;
	private String customerGender; 
	private int insuranceCount;
	
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getCustomerAge() {
		return customerAge;
	}
	public void setCustomerAge(int customerAge) {
		this.customerAge = customerAge;
	}
	public String getCustomerGender() {
		return customerGender;
	}
	public void setCustomerGender(String customerGender) {
		this.customerGender = customerGender;
	}
	public int getInsuranceCount() {
		return insuranceCount;
	}
	public void setInsuranceCount(int insuranceCount) {
		this.insuranceCount = insuranceCount;
	}
}