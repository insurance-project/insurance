package com.insurance.service;

import com.insurance.model.insurance.Insurance;
import com.insurance.model.insurance.SalePerform;

public interface SalePerformService {

	void InsertSalePerform(SalePerform salePerform) throws Exception;

	void UpdateSalePerform(SalePerform salePerform) throws Exception;

	void DeleteSalePerform(int insuranceID) throws Exception;

	SalePerform SelectSalePerformInfo(int salePerformID) throws Exception;

	void updateSubscribers(SalePerform salePerform) throws Exception;

	SalePerform SelectInsuranceSaleInfo(int salePerformID) throws Exception;


}
