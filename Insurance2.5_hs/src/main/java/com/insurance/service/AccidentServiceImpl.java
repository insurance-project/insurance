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
import com.insurance.model.contract.Contract;
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
	public int SelectContractID(Contract contract) throws Exception {
		return accidentDAO.SelectContractID(contract);
	}
	
	@Override
	public List<ContractDTO> SelectContract(int contractID) throws Exception {
		return accidentDAO.SelectContract(contractID);
	}

	@Override
	public void InsertAccident(Accident accident) throws Exception {
		accidentDAO.InsertAccident(accident);		
	}

}