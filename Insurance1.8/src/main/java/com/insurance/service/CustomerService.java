package com.insurance.service;

import java.util.List;

import com.insurance.model.customer.Customer;
import com.insurance.model.insurance.Insurance;

public interface CustomerService {
	
	public void InsertCustomer(Customer customer) throws Exception;
	public List<Customer> CustomerList() throws Exception;
}
