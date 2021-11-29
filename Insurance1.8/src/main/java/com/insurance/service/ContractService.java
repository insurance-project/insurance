package com.insurance.service;

import java.util.List;

import com.insurance.model.contract.Contract;
import com.insurance.model.contract.ContractCount;
import com.insurance.model.customer.Customer;

public interface ContractService {

	List<ContractCount> CustomerContractList() throws Exception;
	void InsertContractInfo(Contract contract) throws Exception;
	
}
