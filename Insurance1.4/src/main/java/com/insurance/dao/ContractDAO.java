package com.insurance.dao;



import com.insurance.model.contract.Contract;

public interface ContractDAO {
	public void create(Contract contract);
	
	public void deleteAll();
	
}
