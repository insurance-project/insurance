package com.insurance.dao;

import java.sql.ResultSet;

import com.insurance.model.insurance.AllowStandard;

public class AllowStandardDAOImpl extends DAO implements AllowStandardDAO {

	public AllowStandardDAOImpl() {
		try {
			super.connect();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void create(AllowStandard allow,int id) {
		// TODO Auto-generated method stub
		String query = "insert into allowstandard (customerMinAge,customerMaxAge,customerGender,customerIncome,id) values ("+
		allow.getCustomerMinAge()+","+
		allow.getCustomerMaxAge()+","+
		allow.getCustomerGender()+","+
		allow.getCustomerIncome()+","+
		id+");";		
		
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
		String query = "truncate allowstandard;";		
		try {
			super.update(query);			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void deleteByName(String name) {
		// TODO Auto-generated method stub
		String query = "alter table allowstandard drop column "+name;		
		try {
			super.delete(query);			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public AllowStandard retrieveById(int insId) {
		// TODO Auto-generated method stub
		AllowStandard ins = new AllowStandard();
		String query = "select * from allowstandard where id = "+insId;
		try {
			ResultSet rs = super.retrieve(query);
			while(rs.next()){				
				int customerAge = rs.getInt("customerAge");
				int customerGender = rs.getInt("customerGender");
				int customerIncome = rs.getInt("customerIncome");
				ins.setCustomerMinAge(customerAge);
				ins.setCustomerGender(customerGender);			
				ins.setCustomerIncome(customerIncome);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ins;
	}


}
