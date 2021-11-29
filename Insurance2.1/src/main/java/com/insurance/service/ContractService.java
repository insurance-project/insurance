package com.insurance.service;

import java.util.List;

import com.insurance.model.contract.Contract;
import com.insurance.model.contract.ContractCount;

public interface ContractService {

	List<ContractCount> CustomerContractList() throws Exception;
	void InsertContractInfo(Contract contract) throws Exception;
	List<ContractCount> InsuranceContractList() throws Exception;
}