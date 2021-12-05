package com.insurance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.dao.InsuranceDAO;
import com.insurance.model.insurance.Insurance;

@Service
public class InsuranceServiceImpl implements InsuranceService{
	@Autowired
	InsuranceDAO insuranceDAO;
	
	@Override
	public void InsertInsurance(Insurance insurance) throws Exception {
		insuranceDAO.InsertInsurance(insurance);
	}

	@Override
	public List<Insurance> SelectInsuranceList() throws Exception {
		return insuranceDAO.SelectInsuranceList();
	}

	@Override
	public Insurance SelectInsuranceInfo(int insuranceID) throws Exception {
		return insuranceDAO.SelectInsuranceInfo(insuranceID);
	}

	@Override
	public void UpdateInsuranceInfo(Insurance insurance) throws Exception {
		insuranceDAO.UpdateInsuranceInfo(insurance);
		
	}

	@Override
	public void DeleteInsurance(int insuranceID) throws Exception {
		insuranceDAO.DeleteInsurance(insuranceID);
		
	}

	@Override
	public void UpdateSalePerfomID(Insurance insurance) throws Exception {
		insuranceDAO.UpdateSalePerfomID(insurance);
		
	}

	@Override
	public void UpdateAllowStandard(Insurance insurance) throws Exception {
		insuranceDAO.UpdateAllowStandard(insurance);
		
	}

	@Override
	public List<Insurance> SelectInsuranceStandardList() throws Exception {
		return insuranceDAO.SelectInsuranceStandardList();
	}

}
