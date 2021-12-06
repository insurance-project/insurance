package com.insurance.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.insurance.dto.ContractDTO;
import com.insurance.dto.ReceiptDTO;
import com.insurance.model.accident.Accident;
import com.insurance.model.accident.Reward;
import com.insurance.model.insurance.Insurance;

@Service
@Repository
public class RewardDAOImpl implements RewardDAO {

	@Autowired
	private SqlSessionTemplate sqlSession;

	@Override
	public List<ReceiptDTO> SelectAccidentInfoList() throws Exception {
		return sqlSession.selectList("SelectAccidentInfoList");
	}

	@Override
	public List<ReceiptDTO> SelectAccident(int accidentID) throws Exception {
		return sqlSession.selectList("SelectAccident", accidentID);
	}

	@Override
	public int SelectRewardCost(int accidentID) throws Exception {
		return sqlSession.selectOne("SelectRewardCost", accidentID);
	}

	@Override
	public int InsertRewardInfo(Reward reward) throws Exception {
		return sqlSession.insert("InsertRewardInfo", reward);
	}

	@Override
	public int InsertAccidentReward(Accident accident) throws Exception {
		return sqlSession.update("InsertAccidentReward", accident);
	}
}