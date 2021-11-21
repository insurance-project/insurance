package com.insurance.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DAO {
	Connection connect = null;
	Statement statement = null;
	ResultSet resultSet = null;
	
	public void connect() throws Exception{	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/insurance?serverTimezone=UTC&allowPublicKeyRetrieval=true&useSSL=false","root","Wpwndhks9!");
		
		}catch(Exception e){
			e.printStackTrace();
		}			
	}
	
	public void create(String query) throws Exception {
		try {
			statement = connect.createStatement();
			if(!statement.execute(query)) System.out.println("insert OK!!!");
		}catch(Exception e){
			e.printStackTrace();
		}		
	}
	
	public void update(String query) throws Exception {
		try {
			statement = connect.createStatement();
			if(!statement.execute(query)) System.out.println("update OK!!!");
		}catch(Exception e){
			e.printStackTrace();
		}			
	}
	
	public void delete(String query) throws Exception {
		try {
			statement = connect.createStatement();
			if(!statement.execute(query)) System.out.println("delete OK!!!");
		}catch(Exception e){
			e.printStackTrace();
		}			
	}
	
	public ResultSet retrieve(String query) throws Exception{
		try {			
			resultSet = statement.executeQuery(query);
			return resultSet;
		}catch(Exception e){
			e.printStackTrace();
			throw e;
		}	
	}
}
