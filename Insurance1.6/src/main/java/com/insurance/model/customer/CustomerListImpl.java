package com.insurance.model.customer;
import java.util.ArrayList;
import java.util.Scanner;

import com.insurance.model.insurance.Insurance;

public class CustomerListImpl implements CustomerList {

	private ArrayList<Customer> customerList = new ArrayList<Customer>();
	public Insurance m_Insurance;

	public CustomerListImpl(){

	}

	public void finalize() throws Throwable {

	}
	
	public boolean add(Customer customer){
		if(this.customerList.add(customer))return true;
		else return false;
	}

	public boolean delete(Customer customer){
		if(this.customerList.remove(customer))return true;
		else return false;
	}	
	
	public ArrayList<Customer> getCustomerList() {
		return customerList;
	}

	public void setCustomerList(ArrayList<Customer> customerList) {
		this.customerList = customerList;
	}
	
	public Customer selectCustomer() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		return customerList.get(a-1);
	}

}