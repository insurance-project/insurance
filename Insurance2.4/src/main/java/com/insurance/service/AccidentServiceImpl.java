package com.insurance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.dao.AccidentDAO;
import com.insurance.dao.RewardDAO;
import com.insurance.dto.ContractDTO;
import com.insurance.dto.ReceiptDTO;
import com.insurance.model.accident.Accident;
import com.insurance.model.accident.Reward;
import com.insurance.model.insurance.Insurance;

@Service
public class AccidentServiceImpl implements AccidentService{

	@Autowired
	AccidentDAO accidentDAO;
	
	@Override
	public List<Insurance> SelectContractInsuranceList(int customerID) throws Exception {
		return accidentDAO.SelectContractInsuranceList(customerID);
	}

	@Override
	public String SelectInsurance(ContractDTO contractDTO) throws Exception {
		return accidentDAO.SelectInsurance(contractDTO);
	}

	@Override
	public String SelectCustomer(ContractDTO contractDTO) throws Exception {
		return accidentDAO.SelectCustomer(contractDTO);
	}

	@Override
	public int SelectContractID(ContractDTO contractDTO) throws Exception {
		return accidentDAO.SelectContractID(contractDTO);
	}

	@Override
	public void InsertCustomerToAccident(Accident accident) throws Exception {
		accidentDAO.InsertCustomerToAccident(accident);		
	}

}