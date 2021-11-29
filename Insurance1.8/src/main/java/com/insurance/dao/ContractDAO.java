package com.insurance.dao;



import java.util.List;

import com.insurance.model.contract.Contract;
import com.insurance.model.contract.ContractCount;
import com.insurance.model.customer.Customer;

public interface ContractDAO {
	public List<ContractCount> CustomerContractList() throws Exception;
	public void InsertContractInfo(Contract contract) throws Exception;
	
}
