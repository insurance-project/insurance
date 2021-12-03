package com.insurance.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.insurance.dto.ContractDTO;
import com.insurance.model.accident.Accident;
import com.insurance.model.contract.Contract;
import com.insurance.model.insurance.Insurance;

@Service
@Repository
public class AccidentDAOImpl implements AccidentDAO{
	
	@Autowired
	private SqlSessionTemplate sqlSession;

	@Override
	public List<Insurance> SelectContractInsuranceList(int customerID) throws Exception {
		return sqlSession.selectList("SelectContractInsuranceList", customerID);
	}

	@Override
	public int SelectContractID(Contract contract) throws Exception {
		return sqlSession.selectOne("SelectContractID", contract);
	}

	@Override
	public List<ContractDTO> SelectContract(int contractID) throws Exception {
		return sqlSession.selectList("SelectContract", contractID);
	}

	@Override
	public void InsertAccident(Accident accident) throws Exception {
		sqlSession.insert("InsertAccident", accident);
	}

}
