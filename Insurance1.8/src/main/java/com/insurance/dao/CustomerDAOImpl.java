 package com.insurance.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.insurance.model.customer.Customer;
 
@Service
@Repository
public class CustomerDAOImpl implements CustomerDAO {
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Override
	public void InsertCustomer(Customer customer) throws Exception {
		sqlSession.insert("InsertCustomer", customer);
	}

	@Override
	public List<Customer> CustomerList() throws Exception {
		return sqlSession.selectList("CustomerList");
	}
}
