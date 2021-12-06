package com.insurance.dto;

public class ReceiptDTO {

	private int accidentID;
	private int customerID;
	private int insuranceID;
	private String customerName;
	private String insuranceName;
	private String accidentKind;
	private String accidentDate;
	private int damagePrice;
	private int rewardCost;
	
	public int getAccidentID() {
		return accidentID;
	}
	public void setAccidentID(int accidentID) {
		this.accidentID = accidentID;
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
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getInsuranceName() {
		return insuranceName;
	}
	public void setInsuranceName(String insuranceName) {
		this.insuranceName = insuranceName;
	}
	public String getAccidentKind() {
		return accidentKind;
	}
	public void setAccidentKind(String accidentKind) {
		this.accidentKind = accidentKind;
	}
	public String getAccidentDate() {
		return accidentDate;
	}
	public void setAccidentDate(String accidentDate) {
		this.accidentDate = accidentDate;
	}
	public int getDamagePrice() {
		return damagePrice;
	}
	public void setDamagePrice(int damagePrice) {
		this.damagePrice = damagePrice;
	}
	public int getRewardCost() {
		return rewardCost;
	}
	public void setRewardCost(int rewardCost) {
		this.rewardCost = rewardCost;
	}
	
}
