package com.insurance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.dao.AllowStandardDAO;
import com.insurance.dao.PredictProfitDAO;
import com.insurance.dto.AllowStandardDTO;
import com.insurance.dto.ContractDTO;
import com.insurance.model.insurance.AllowStandard;
import com.insurance.model.insurance.Insurance;
import com.insurance.model.insurance.PredictProfit;

@Service
public class AllowStandardServiceImpl implements AllowStandardService{
	@Autowired
	AllowStandardDAO allowStandardDAO;
	
	@Override
	public void InsertAllowStandard(AllowStandard AllowStandard) throws Exception {
		allowStandardDAO.InsertAllowStandard(AllowStandard);
	}	
	
	@Override
	public void DeleteAllowStandard(int AllowStandardID) throws Exception {
		allowStandardDAO.DeleteAllowStandard(AllowStandardID);
	}	
	@Override
	public List<AllowStandardDTO> NonAllowStandardInsuranceList() throws Exception {
		return  allowStandardDAO.NonAllowStandardInsuranceList();
	}
	
	@Override
	public AllowStandard SelectAllowStandardInfo(int AllowStandardID) throws Exception {
		return allowStandardDAO.SelectAllowStandardInfo(AllowStandardID);
	}
}
