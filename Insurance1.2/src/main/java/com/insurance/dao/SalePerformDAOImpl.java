package com.insurance.dao;

import java.sql.ResultSet;

import com.insurance.model.insurance.SalePerform;

public class SalePerformDAOImpl extends DAO implements SalePerformDAO {

	public SalePerformDAOImpl() {
		try {
			super.connect();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void create(SalePerform predict,int id) {
		// TODO Auto-generated method stub
		String query = "insert into SalePerform (profit,subscribers,totalprofit,id) values ("+
		predict.getProfit()+","+		
		predict.getSubscribers()+","+
		predict.getTotalProfit()+","+
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
		String query = "truncate SalePerform;";		
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
		String query = "alter table SalePerform drop column "+name;		
		try {
			super.delete(query);			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

	@Override
	public SalePerform retrieveById(int insId) {
		// TODO Auto-generated method stub
		SalePerform ins = new SalePerform();
		String query = "select * from PredictProfit where id = "+insId;
		try {
			ResultSet rs = super.retrieve(query);
			while(rs.next()){		
				int profit = rs.getInt("profit");
				int subscribers = rs.getInt("subscribers");
				int totalprofit = rs.getInt("totalprofit");
				ins.setProfit(profit);
				ins.setSubscribers(subscribers);
				ins.setTotalProfit(totalprofit);		
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ins;
	}


}
