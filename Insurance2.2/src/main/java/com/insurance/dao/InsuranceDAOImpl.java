package com.insurance.dao;

import com.insurance.model.insurance.Insurance;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
@Repository
public class InsuranceDAOImpl implements InsuranceDAO {
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Override
	public void InsertInsurance(Insurance insurance) throws Exception {
		sqlSession.insert("InsertInsurance", insurance);
	}
	
	@Override
	public List<Insurance> SelectInsuranceList() throws Exception {
		return sqlSession.selectList("SelectInsuranceList");
	}

	@Override
	public Insurance SelectInsuranceInfo(int insuranceID) throws Exception  {
		return sqlSession.selectOne("SelectInsuranceInfo", insuranceID);
	}

	@Override
	public void UpdateInsuranceInfo(Insurance insurance) throws Exception {
		sqlSession.update("UpdateInsuranceInfo", insurance);
		
	}

	@Override
	public void DeleteInsurance(int insuranceID) throws Exception {
		sqlSession.delete("DeleteInsurance", insuranceID);
		
	}

	@Override
	public void UpdateSalePerfomID(Insurance insurance) throws Exception {
		sqlSession.update("UpdateSalePerfomID", insurance);
		
	}

}
