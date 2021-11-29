package com.insurance.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.insurance.model.insurance.PredictProfit;

@Service
@Repository
public class PredictProfitDAOImpl extends DAO implements PredictProfitDAO {

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Override
	public void InsertPredictProfit(PredictProfit predictProfit) throws Exception {
		sqlSession.insert("InsertPredictProfit", predictProfit);
	}


}
