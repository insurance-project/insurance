package com.insurance.dto;

public class ReceiptDTO {

	private int accidentID;
	private String customerName;
	private String insuranceName;
	private String accidentKind;
	private String accidentDate;
	private int damagePrice;
	
	public int getAccidentID() {
		return accidentID;
	}
	public void setAccidentID(int accidentID) {
		this.accidentID = accidentID;
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
}
