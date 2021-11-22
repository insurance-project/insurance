package com.insurance.dao;

import java.util.ArrayList;

import com.insurance.model.accident.Reward;

public interface RewardDAO {

	
	public void create(Reward reward);
	public void delete(String ID);
	public Reward retreiveById(String ID);
	public ArrayList<Reward> listReward(Reward reward);
}
