package com.insurance.dao;

import com.insurance.model.insurance.PredictProfit;

public interface PredictProfitDAO {
	public void create(PredictProfit preProfit,int id);
	public void deleteAll();
	public void deleteByName(String name);
	public PredictProfit retrieveById(int preproId);

}
