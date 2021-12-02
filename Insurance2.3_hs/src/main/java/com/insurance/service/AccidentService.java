package com.insurance.service;

import java.util.List;

import com.insurance.dto.ContractDTO;
import com.insurance.dto.ReceiptDTO;
import com.insurance.model.accident.Accident;
import com.insurance.model.accident.Reward;
import com.insurance.model.insurance.Insurance;

public interface AccidentService {
	public List<Insurance> SelectContractInsuranceList(int customerID) throws Exception;
	public String SelectInsurance(ContractDTO contractDTO) throws Exception;
	public String SelectCustomer(ContractDTO contractDTO) throws Exception;
	public int SelectContractID(ContractDTO contractDTO) throws Exception;
	public void InsertCustomerToAccident(Accident accident) throws Exception;
	
}