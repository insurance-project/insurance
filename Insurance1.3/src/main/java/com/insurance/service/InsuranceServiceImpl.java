package com.insurance.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.dao.InsuranceDAO;
import com.insurance.model.insurance.Insurance;

@Service
public class InsuranceServiceImpl implements InsuranceService{
	@Autowired
	InsuranceDAO insuranceDAO;
	
	@Override
	public void InsertInsurance(Insurance insurance) {
		insuranceDAO.InsertInsurance(insurance);
	}

}
