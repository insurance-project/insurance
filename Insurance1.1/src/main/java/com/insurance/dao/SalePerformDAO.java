package com.insurance.dao;

import com.insurance.model.insurance.SalePerform;

public interface SalePerformDAO {
	public void create(SalePerform salePerform,int id);
	public void deleteAll();
	public void deleteByName(String name);
	public SalePerform retrieveById(int saleId);
	
}
