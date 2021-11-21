package com.insurance.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.insurance.dao.InsuranceDAO;
import com.insurance.model.insurance.Insurance;

public class InsuranceServiceImpl {
	@Autowired
	InsuranceDAO insuranceDAO;
	
	public void InsertInsurance(Insurance insurance) {
		insuranceDAO.InsertInsurance(insurance);
	}


}
