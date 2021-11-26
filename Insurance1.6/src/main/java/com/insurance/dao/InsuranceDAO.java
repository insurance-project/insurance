package com.insurance.dao;

import java.util.List;

import com.insurance.model.insurance.Insurance;
public interface InsuranceDAO {
	
	public void InsertInsurance(Insurance insurance) throws Exception;
	public List<Insurance> SelectInsuranceList() throws Exception;
}
