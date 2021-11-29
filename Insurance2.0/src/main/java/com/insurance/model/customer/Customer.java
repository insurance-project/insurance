package com.insurance.model.customer;

import java.util.ArrayList;
import java.util.Scanner;

import com.insurance.model.insurance.Insurance;

public class Customer {

	private int customerID;
	private int customerAge;
	private String customerGender;	
	private int income; // 사용 안함
	private String customerJob;
	private String customerName;
	private String phoneNumber;
	private String residentNumber;
	
	//composition class
	private AdditionalInfo additionalInfo = new AdditionalInfo();
	private ArrayList<Insurance> joinedInsuranceList = new ArrayList<Insurance>();
		
	public String getCustomerJob() {
		return customerJob;
	}

	public void setCustomerJob(String customerJob) {
		this.customerJob = customerJob;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getResidentNumber() {
		return residentNumber;
	}

	public void setResidentNumber(String residentNumber) {
		this.residentNumber = residentNumber;
	}
	
	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	
	public AdditionalInfo getAdditionalInfo() {
		return additionalInfo;
	}

	public void setAdditionalInfo(AdditionalInfo additionalInfo) {
		this.additionalInfo = additionalInfo;
	}
	
	public ArrayList<Insurance> getJoinedInsuranceList() {
		return joinedInsuranceList;
	}

	public void setJoinedInsuranceList(ArrayList<Insurance> joinedInsuranceList) {
		this.joinedInsuranceList = joinedInsuranceList;
	}	
	
	public Insurance selectCustomerInsurance()
	{		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		return joinedInsuranceList.get(a-1);
	}	
	
	public void AddCustomerInsurance(Insurance ins)
	{
		this.joinedInsuranceList.add(ins);
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

	public int getIncome() {
		return income;
	}

	public void setIncome(int income) {
		this.income = income;
	}

}