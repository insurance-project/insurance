package com.insurance.service;

import java.util.List;

import com.insurance.model.insurance.Insurance;

public interface InsuranceService {
	
	public void InsertInsurance(Insurance insurance) throws Exception;
	public List<Insurance> SelectInsuranceList() throws Exception;

}
