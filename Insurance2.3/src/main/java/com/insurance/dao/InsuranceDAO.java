package com.insurance.dao;

import java.util.List;

import com.insurance.model.insurance.Insurance;
public interface InsuranceDAO {
	
	public void InsertInsurance(Insurance insurance) throws Exception;
	public List<Insurance> SelectInsuranceList() throws Exception;
	public Insurance SelectInsuranceInfo(int insuranceID) throws Exception;
	public void UpdateInsuranceInfo(Insurance insurance) throws Exception;
	public void DeleteInsurance(int insuranceID) throws Exception;
	public void UpdateSalePerfomID(Insurance insurance) throws Exception;
}
