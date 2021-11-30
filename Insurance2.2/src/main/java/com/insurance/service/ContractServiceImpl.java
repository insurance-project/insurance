package com.insurance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.dao.ContractDAO;
import com.insurance.dto.ContractDTO;
import com.insurance.model.contract.Contract;

@Service
public class ContractServiceImpl implements ContractService{
	
	@Autowired
	ContractDAO contractDAO;

	@Override
	public List<ContractDTO> CustomerContractList() throws Exception {
		return contractDAO.CustomerContractList();
	}

	@Override
	public void InsertContractInfo(Contract contract) throws Exception{
		contractDAO.InsertContractInfo(contract);
	}

	@Override
	public List<ContractDTO> InsuranceContractList() throws Exception {
		return  contractDAO.InsuranceContractList();
	}

	

}