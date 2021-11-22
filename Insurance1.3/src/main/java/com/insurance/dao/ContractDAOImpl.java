package com.insurance.dao;

import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.Statement;
import com.insurance.model.contract.Contract;

public class ContractDAOImpl extends DAO implements ContractDAO  {

	Connection connect = null;
	Statement statement = null;
	ResultSet rs = null;
	

	public ContractDAOImpl() {
			try {
				super.connect();
			} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
				}
			}
	
	@Override
	public void create(Contract contract) {
		// TODO Auto-generated method stub
		String query = "insert into contract (date1) values ("+
				"'"+contract.getDate1()+");";
				
				System.out.println(query);
				try {
					super.create(query);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}

	

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		String query = "truncate contract;";		
		try {
			super.update(query);			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
