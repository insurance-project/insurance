package com.insurance.service;

import java.util.List;

import com.insurance.model.customer.Customer;

public interface CustomerService {
	
	public void InsertCustomer(Customer customer) throws Exception;
	public List<Customer> CustomerList() throws Exception;
	public Customer SelectCustomerInfo(int customerID) throws Exception;
}
