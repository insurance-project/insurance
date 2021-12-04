package com.insurance.dao;

import java.util.List;

import com.insurance.model.customer.Customer;

public interface CustomerDAO {
	public void InsertCustomer(Customer customer) throws Exception;
	public List<Customer> CustomerList() throws Exception;
	public Customer SelectCustomerInfo(int customerID) throws Exception;
}
