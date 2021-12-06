package com.insurance.service;

import java.util.List;

import com.insurance.dto.ContractDTO;
import com.insurance.dto.ReceiptDTO;
import com.insurance.model.accident.Accident;
import com.insurance.model.accident.Reward;
import com.insurance.model.contract.Contract;
import com.insurance.model.insurance.Insurance;

public interface AccidentService {
	public List<Insurance> SelectContractInsuranceList(int customerID) throws Exception;
	public int SelectContractID(Contract contract) throws Exception;
	public List<ContractDTO> SelectContract(int contractID) throws Exception;
	public void InsertAccident(Accident accident) throws Exception;
}