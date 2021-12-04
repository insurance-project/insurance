package com.insurance.dao;


import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.insurance.model.insurance.SalePerform;

@Service
@Repository
public class SalePerformDAOImpl implements SalePerformDAO {
	
	@Autowired
	private SqlSessionTemplate sqlSession;

	@Override
	public void InsertSalePerform(SalePerform salePerform) throws Exception {
		sqlSession.insert("InsertSalePerform", salePerform);
		
	}

	@Override
	public void UpdateSalePerform(SalePerform salePerform) throws Exception {
		sqlSession.update("UpdateSalePerform", salePerform);
		
	}

	@Override
	public void DeleteSalePerform(int insuranceID) throws Exception {
		sqlSession.delete("DeleteSalePerform", insuranceID);
		
	}

	@Override
	public SalePerform SelectSalePerformInfo(int salePerformID) throws Exception {
		return sqlSession.selectOne("SelectSalePerformInfo", salePerformID);
	}

	@Override
	public void updateSubscribers(SalePerform salePerform) throws Exception {
		sqlSession.update("updateSubscribers", salePerform);
		
	}

	@Override
	public SalePerform SelectInsuranceSaleInfo(int salePerformID) throws Exception {
		return sqlSession.selectOne("SelectInsuranceSaleInfo", salePerformID);
	}

	


}
