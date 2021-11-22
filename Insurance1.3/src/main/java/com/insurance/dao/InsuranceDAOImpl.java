package com.insurance.dao;

import com.insurance.model.insurance.Insurance;
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
	public void InsertInsurance(Insurance insurance) {
		sqlSession.insert("InsertInsurance", insurance);
	}
}
