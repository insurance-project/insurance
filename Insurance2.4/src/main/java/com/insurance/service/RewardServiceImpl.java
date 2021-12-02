package com.insurance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.dao.RewardDAO;
import com.insurance.dto.ContractDTO;
import com.insurance.dto.ReceiptDTO;
import com.insurance.model.accident.Accident;
import com.insurance.model.accident.Reward;
import com.insurance.model.insurance.Insurance;

@Service
public class RewardServiceImpl implements RewardService{

	@Autowired
	RewardDAO rewardDAO;

	@Override
	public Accident SelectAccidentInfo(Accident accident) throws Exception {
		return rewardDAO.SelectAccidentInfo(accident);
	}
	
	@Override
	public List<ReceiptDTO> SelectAccidentInfoList() throws Exception {
		return rewardDAO.SelectAccidentInfoList();
	}

	@Override
	public int SelectRewardCost(int accidentID) throws Exception {
		return rewardDAO.SelectRewardCost(accidentID);
	}

	@Override
	public void InsertRewardInfo(Reward reward) throws Exception {
		rewardDAO.InsertRewardInfo(reward);
	}
}