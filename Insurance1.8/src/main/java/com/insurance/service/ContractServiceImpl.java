package com.insurance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.dao.ContractDAO;
import com.insurance.dao.CustomerDAO;
import com.insurance.dao.InsuranceDAO;
import com.insurance.model.contract.Contract;
import com.insurance.model.contract.ContractCount;
import com.insurance.model.customer.Customer;
import com.insurance.model.insurance.Insurance;

@Service
public class ContractServiceImpl implements ContractService{
	
	@Autowired
	ContractDAO contractDAO;

	@Override
	public List<ContractCount> CustomerContractList() throws Exception {
		return contractDAO.CustomerContractList();
	}

	@Override
	public void InsertContractInfo(Contract contract) throws Exception{
		contractDAO.InsertContractInfo(contract);
	}

	

}
