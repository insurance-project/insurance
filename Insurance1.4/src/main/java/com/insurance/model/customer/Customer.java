package com.insurance.model.customer;

import java.util.ArrayList;
import java.util.Scanner;

import com.insurance.model.insurance.Insurance;

public class Customer {

	private int id;
	private int customerAge;
	private int customerGender;	
	private int income; // 사용 안함
	private String job;
	private String name;
	private String phoneNumber;
	private String residentNumber;
	
	//composition class
	private AdditionalInfo additionalInfo = new AdditionalInfo();
	private ArrayList<Insurance> joinedInsuranceList = new ArrayList<Insurance>();
		
	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getCustomerGender() {
		return customerGender;
	}

	public void setCustomerGender(int customerGender) {
		this.customerGender = customerGender;
	}

	public int getIncome() {
		return income;
	}

	public void setIncome(int income) {
		this.income = income;
	}

}