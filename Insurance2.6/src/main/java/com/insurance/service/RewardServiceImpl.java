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
	public List<ReceiptDTO> SelectAccidentInfoList() throws Exception {
		return rewardDAO.SelectAccidentInfoList();
	}

	@Override
	public List<ReceiptDTO> SelectAccident(int accidentID) throws Exception{
		return rewardDAO.SelectAccident(accidentID);
	}
	
	@Override
	public int SelectRewardCost(int accidentID) throws Exception {
		return rewardDAO.SelectRewardCost(accidentID);
	}

	@Override
	public int InsertRewardInfo(Reward reward) throws Exception {
		return rewardDAO.InsertRewardInfo(reward);
	}

	@Override
	public int InsertAccidentReward(Accident accident) throws Exception{
		return rewardDAO.InsertAccidentReward(accident);
	}
}