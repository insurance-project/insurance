package com.insurance.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.dao.PredictProfitDAO;
import com.insurance.model.insurance.PredictProfit;

@Service
public class PredictProfitServiceImpl implements PredictProfitService{
	@Autowired
	PredictProfitDAO predictProfitDAO;
	
	@Override
	public void InsertPredictProfit(PredictProfit predictProfit) throws Exception {
		predictProfitDAO.InsertPredictProfit(predictProfit);
	}	

}
