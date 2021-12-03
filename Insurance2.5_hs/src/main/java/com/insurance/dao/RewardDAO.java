package com.insurance.dao;

import java.util.List;

import com.insurance.dto.ContractDTO;
import com.insurance.dto.ReceiptDTO;
import com.insurance.model.accident.Accident;
import com.insurance.model.accident.Reward;
import com.insurance.model.insurance.Insurance;

public interface RewardDAO {
	public List<ReceiptDTO> SelectAccidentInfoList() throws Exception;
	public List<ReceiptDTO> SelectAccident(int accidentID) throws Exception;
	public int SelectRewardCost(int accidentID) throws Exception;
	public int InsertRewardInfo(Reward reward) throws Exception;
	public int InsertAccidentReward(Accident accident) throws Exception;
}
