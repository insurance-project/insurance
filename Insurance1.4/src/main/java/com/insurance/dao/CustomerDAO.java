package com.insurance.dao;

import java.util.ArrayList;

import com.insurance.model.customer.Customer;

public interface  CustomerDAO {
	public void create(Customer customer);
	public void deleteByName(String name);
	public Customer retrieveById(int customerID);
	public ArrayList<Customer> customerList(Customer customer);
	public void deleteAll();
}
