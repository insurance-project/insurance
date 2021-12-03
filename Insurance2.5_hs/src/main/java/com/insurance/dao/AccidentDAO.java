package com.insurance.dao;

import java.util.List;

import com.insurance.dto.ContractDTO;
import com.insurance.model.accident.Accident;
import com.insurance.model.contract.Contract;
import com.insurance.model.insurance.Insurance;

public interface AccidentDAO {
	public List<Insurance> SelectContractInsuranceList(int customerID) throws Exception;
	public int SelectContractID(Contract contract) throws Exception;
	public List<ContractDTO> SelectContract(int contractID) throws Exception;
	public void InsertAccident(Accident accident) throws Exception;
}
