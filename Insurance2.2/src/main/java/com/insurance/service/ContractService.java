package com.insurance.service;

import java.util.List;

import com.insurance.dto.ContractDTO;
import com.insurance.model.contract.Contract;

public interface ContractService {

	List<ContractDTO> CustomerContractList() throws Exception;
	void InsertContractInfo(Contract contract) throws Exception;
	List<ContractDTO> InsuranceContractList() throws Exception;
}