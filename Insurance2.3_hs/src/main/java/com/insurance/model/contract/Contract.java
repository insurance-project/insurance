package com.insurance.model.contract;



public class Contract {
	
	private int contractID;
	private int customerID;
	private int insuranceID;
	private boolean judge;
	
	
	public int getContractID() {
		return contractID;
	}
	public void setContractID(int contractID) {
		this.contractID = contractID;
	}
	public boolean isJudge() {
		return judge;
	}
	public void setJudge(boolean judge) {
		this.judge = judge;
	}
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public int getInsuranceID() {
		return insuranceID;
	}
	public void setInsuranceID(int insuranceID) {
		this.insuranceID = insuranceID;
	}
	
	
	
}