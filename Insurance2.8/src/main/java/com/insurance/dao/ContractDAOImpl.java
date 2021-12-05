package com.insurance.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.insurance.dto.ContractDTO;
import com.insurance.model.contract.Contract;

@Service
@Repository
public class ContractDAOImpl implements ContractDAO  {

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Override
	public List<ContractDTO> CustomerContractList() throws Exception {
		return sqlSession.selectList("CustomerContractList");
	}

	@Override
	public void InsertContractInfo(Contract contract) throws Exception {
		sqlSession.insert("InsertContractInfo", contract);
	}

	@Override
	public List<ContractDTO> InsuranceContractList() throws Exception {
		return sqlSession.selectList("InsuranceContractList");
	}
	
	@Override
	public List<ContractDTO> NonJudgeCustomerList() throws Exception {
		return sqlSession.selectList("NonJudgeCustomerList");
	}
	@Override
	public void SetContractJudge(Contract contract) throws Exception {
		sqlSession.update("SetContractJudge", contract);
		
	}

	@Override
	public int CheckContract(Contract contract) throws Exception {
		int result = sqlSession.selectOne("CheckContract", contract);
		return result;
	}

}