package com.insurance.dao;



import java.util.List;

import com.insurance.dto.ContractDTO;
import com.insurance.model.contract.Contract;

public interface ContractDAO {
	public List<ContractDTO> CustomerContractList() throws Exception;
	public void InsertContractInfo(Contract contract) throws Exception;
	public List<ContractDTO> InsuranceContractList() throws Exception;
	public List<ContractDTO> NonJudgeCustomerList() throws Exception;
	public void SetContractJudge(Contract contract) throws Exception;
	public int CheckContract(Contract contract) throws Exception;
	
}