package com.insurance.dao;

import java.util.List;

import com.insurance.dto.ContractDTO;
import com.insurance.model.accident.Accident;
import com.insurance.model.insurance.Insurance;

public interface AccidentDAO {
	public List<Insurance> SelectContractInsuranceList(int customerID) throws Exception;
	public String SelectInsurance(ContractDTO contractDTO) throws Exception;
	public String SelectCustomer(ContractDTO contractDTO) throws Exception;
	public int SelectContractID(ContractDTO contractDTO) throws Exception;
	public void InsertCustomerToAccident(Accident accident) throws Exception;
}
