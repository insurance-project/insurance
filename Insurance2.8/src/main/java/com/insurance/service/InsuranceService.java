package com.insurance.service;

import java.util.List;

import com.insurance.model.insurance.Insurance;

public interface InsuranceService {
	
	public void InsertInsurance(Insurance insurance) throws Exception;
	public List<Insurance> SelectInsuranceList() throws Exception;
	public Insurance SelectInsuranceInfo(int insuranceID) throws Exception;
	public void UpdateInsuranceInfo(Insurance insurance) throws Exception;
	public void DeleteInsurance(int insuranceID) throws Exception;
	public void UpdateSalePerfomID(Insurance insurance) throws Exception;
	public void UpdateAllowStandard(Insurance insurance) throws Exception;
	public List<Insurance> SelectInsuranceStandardList() throws Exception;

}
