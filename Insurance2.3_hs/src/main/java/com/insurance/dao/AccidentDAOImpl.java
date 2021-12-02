package com.insurance.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.insurance.dto.ContractDTO;
import com.insurance.model.accident.Accident;
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
	public String SelectInsurance(ContractDTO contractDTO) throws Exception {
		return sqlSession.selectOne("SelectInsurance", contractDTO);
	}

	@Override
	public String SelectCustomer(ContractDTO contractDTO) throws Exception {
		return sqlSession.selectOne("SelectCustomer", contractDTO);
	}

	@Override
	public int SelectContractID(ContractDTO contractDTO) throws Exception {
		return sqlSession.selectOne("SelectContractID", contractDTO);
	}

	@Override
	public void InsertCustomerToAccident(Accident accident) throws Exception {
		sqlSession.insert("InsertCustomerToAccident", accident);
	}

}
