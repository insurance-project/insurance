package com.insurance.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.dao.SalePerformDAO;
import com.insurance.model.insurance.Insurance;
import com.insurance.model.insurance.SalePerform;

@Service
public class SalePerformServiceImpl implements SalePerformService {
	@Autowired
	SalePerformDAO salePerformDAO;

	@Override
	public void InsertSalePerform(SalePerform salePerform) throws Exception {
		salePerformDAO.InsertSalePerform(salePerform);
		
	}

	@Override
	public void UpdateSalePerform(SalePerform salePerform) throws Exception {
		salePerformDAO.UpdateSalePerform(salePerform);
		
	}

	@Override
	public void DeleteSalePerform(int insuranceID) throws Exception {
		salePerformDAO.DeleteSalePerform(insuranceID);
		
	}

	@Override
	public SalePerform SelectSalePerformInfo(int salePerformID) throws Exception {
		return salePerformDAO.SelectSalePerformInfo(salePerformID);
	}

	@Override
	public void updateSubscribers(SalePerform salePerform) throws Exception {
		salePerformDAO.updateSubscribers(salePerform);
		
	}

	@Override
	public SalePerform SelectInsuranceSaleInfo(int salePerformID) throws Exception {
		return salePerformDAO.SelectInsuranceSaleInfo(salePerformID);
	}


}
