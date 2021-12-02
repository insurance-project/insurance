package com.insurance.model.insurance;

public class AllowStandard { //인수 기준 설정
	
	private int allowStandardID;
	private int customerMinAge;	
	private int customerMaxAge;
	private int customerGender;
	private int customerIncome; // 사용 안함
	
	
	public int getAllowStandardID() {
		return allowStandardID;
	}
	public void setAllowStandardID(int allowStandardID) {
		this.allowStandardID = allowStandardID;
	}
	public int getCustomerMinAge() {
		return customerMinAge;
	}
	public void setCustomerMinAge(int customerMinAge) {
		this.customerMinAge = customerMinAge;
	}
	public int getCustomerGender() {
		return customerGender;
	}
	public void setCustomerGender(int customerGender) {
		this.customerGender = customerGender;
	}
	public int getCustomerIncome() {
		return customerIncome;
	}
	public void setCustomerIncome(int customerIncome) {
		this.customerIncome = customerIncome;
	}
	public int getCustomerMaxAge() {
		return customerMaxAge;
	}
	public void setCustomerMaxAge(int customerMaxAge) {
		this.customerMaxAge = customerMaxAge;
	}

}
