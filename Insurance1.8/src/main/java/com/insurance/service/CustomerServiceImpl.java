package com.insurance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.dao.CustomerDAO;
import com.insurance.dao.InsuranceDAO;
import com.insurance.model.customer.Customer;
import com.insurance.model.insurance.Insurance;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	CustomerDAO customerDAO;
	
	@Override
	public void InsertCustomer(Customer customer) throws Exception {
		customerDAO.InsertCustomer(customer);
	}

	@Override
	public List<Customer> CustomerList() throws Exception {
		return customerDAO.CustomerList();
	}
}
