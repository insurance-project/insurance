package com.insurance.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.insurance.dto.AllowStandardDTO;
import com.insurance.model.insurance.AllowStandard;

@Service
@Repository
public class AllowStandardDAOImpl implements AllowStandardDAO {

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Override
	public void InsertAllowStandard(AllowStandard AllowStandard) throws Exception {
		sqlSession.insert("InsertAllowStandard", AllowStandard);
	}
	@Override
	public void DeleteAllowStandard(int AllowStandardID) throws Exception {
		sqlSession.delete("DeleteAllowStandard", AllowStandardID);
		
	}
	@Override
	public List<AllowStandardDTO> NonAllowStandardInsuranceList() throws Exception {
		return sqlSession.selectList("NonAllowStandardInsuranceList");
	}
	@Override
	public AllowStandard SelectAllowStandardInfo(int AllowStandardID) throws Exception  {
		return sqlSession.selectOne("SelectAllowStandardInfo", AllowStandardID);
	}
}
