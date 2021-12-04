package com.insurance.dao;

import com.insurance.model.insurance.SalePerform;

public interface SalePerformDAO {
	public void InsertSalePerform(SalePerform salePerform) throws Exception;

	public void UpdateSalePerform(SalePerform salePerform) throws Exception;

	public void DeleteSalePerform(int insuranceID) throws Exception;

	public SalePerform SelectSalePerformInfo(int salePerformID) throws Exception;

	public void updateSubscribers(SalePerform salePerform) throws Exception;

	public SalePerform SelectInsuranceSaleInfo(int salePerformID) throws Exception;
	
}
