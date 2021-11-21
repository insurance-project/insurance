 package com.insurance.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.insurance.model.customer.Customer;
 
public class CustomerDAOImpl extends DAO implements CustomerDAO {
	private ArrayList<Customer> customerList = new ArrayList<Customer>();

	Connection connect = null;
	Statement statement = null;
	ResultSet rs = null;
	
	

	public CustomerDAOImpl() {
			try {
				super.connect();
			} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
				}
			}


			@Override
			public void create(Customer customer) {
				// TODO Auto-generated method stub
				String query = "insert into customer(customerID, job, name, phoneNumber, residentNumber) values ("+
						"0, '" + customer.getId()+"', '"+
						customer.getJob()+"',"+
						customer.getName()+", '"+
						customer.getPhoneNumber()+"',"+
						customer.getResidentNumber()+");";
		
		System.out.println(query);
		try {
			statement = connect.createStatement();
			if(statement.execute(query)) {
				System.out.println("insert ok");
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
			}

			@Override
			public Customer retrieveById(int customerID) {
				// TODO Auto-generated method stub
				Customer customer = new Customer();
				String query = "select * from customer where id= "+ customerID;
				try {
					ResultSet rs = super.retrieve(query);
					while(rs.next()) {
						
						String job = rs.getString("job");
						String name = rs.getString("name");
						String phoneNumber = rs.getString("phoneNumber");
						String residentNumber = rs.getString("residentNumber");
						
						
						customer.setId(customerID);
						customer.setJob(job);
						customer.setName(name);
						customer.setPhoneNumber(phoneNumber);
						customer.setResidentNumber(residentNumber);
						
					}
				} catch(Exception e) {
					e.printStackTrace();
				}
				return customer;
			}

			@Override
			public ArrayList<Customer> customerList(Customer customer) {
				// TODO Auto-generated method stub
				ArrayList<Customer> list = new ArrayList<Customer>();
				String query = "select * from customer;";
				try {
					ResultSet rs = super.retrieve(query);
					while(rs.next()) {
						int customerID = rs.getInt("customerID");
						String job = rs.getString("job");
						String name = rs.getString("name");
						String phoneNumber = rs.getString("phoneNumber");
						String residentNumber = rs.getString("residentNumber");
						
						
						customer.setId(customerID);
						customer.setJob(job);
						customer.setName(name);
						customer.setPhoneNumber(phoneNumber);
						customer.setResidentNumber(residentNumber);
						
						
					}
						
				}catch(Exception e) {
				e.printStackTrace();
			}
				return list;
			}
			
			
			@Override
			public void deleteByName(String name) {
				// TODO Auto-generated method stub
				String query = "delete customer WHERE ID='"+name+"';";		
				try {
					super.delete(query);		
					statement = connect.createStatement();
					if(statement.execute(query)) {
						System.out.println("delete ok");
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}


			@Override
			public void deleteAll() {
				// TODO Auto-generated method stub

				String query = "truncate customer;";		
				try {
					super.update(query);			
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			}

}
