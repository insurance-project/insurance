package com.insurance.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.insurance.model.accident.Reward;

public class RewardDAOImpl implements RewardDAO {

	Connection connect = null;
	Statement statement = null;
	ResultSet resultSet = null;
	
	public void connect() throws Exception{	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/insurance?serverTimezone=UTC&allowPublicKeyRetrieval=true&useSSL=false","root","1234");
		
		}catch(Exception e){
			e.printStackTrace();
		}			
	}
	private ArrayList <Reward> rewardList = new ArrayList<Reward>();
	public RewardDAOImpl() {
		try {
			this.connect();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void create(Reward reward) {
		String query = "insert into reward(rewardID, date, price, ID) values ("+
						"'"+reward.getRewardID()+"',"+
						reward.getDate()+","+
						reward.getPrice()+","+
						reward.getID()+");";
		System.out.println(query);
		try {
			statement = connect.createStatement();
			if(statement.execute(query)) System.out.println("insert OK!!!");
		}catch(Exception e){
			e.printStackTrace();
		}		
	}
	
	@Override
	public void delete(String ID) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Reward retreiveById(String ID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Reward> listReward(Reward reward) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
}
