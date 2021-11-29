package com.insurance.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.insurance.model.contract.Contract;
import com.insurance.model.contract.ContractCount;

@Service
@Repository
public class ContractDAOImpl extends DAO implements ContractDAO  {

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Override
	public List<ContractCount> CustomerContractList() throws Exception {
		return sqlSession.selectList("CustomerContractList");
	}

	@Override
	public void InsertContractInfo(Contract contract) throws Exception {
		sqlSession.insert("InsertContractInfo", contract);
	}

	@Override
	public List<ContractCount> InsuranceContractList() throws Exception {
		return sqlSession.selectList("InsuranceContractList");
	}

}