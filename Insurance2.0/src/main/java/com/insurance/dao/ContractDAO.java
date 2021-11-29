package com.insurance.dao;



import java.util.List;

import com.insurance.model.contract.Contract;
import com.insurance.model.contract.ContractCount;

public interface ContractDAO {
	public List<ContractCount> CustomerContractList() throws Exception;
	public void InsertContractInfo(Contract contract) throws Exception;
	public List<ContractCount> InsuranceContractList() throws Exception;
	
}