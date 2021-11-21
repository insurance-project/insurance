package com.insurance.model.accident;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.insurance.dao.DAO;

public class AccidentListImpl  extends DAO implements AccidentList{
	private static ArrayList<Accident> accidentList = new ArrayList<Accident>();
	Connection connect = null;
	Statement statement = null;
	ResultSet rs = null;
	PreparedStatement psmt= null;

	public AccidentListImpl(){
	}
	public void connect() throws Exception{	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/insurance?serverTimezone=UTC&allowPublicKeyRetrieval=true&useSSL=false","root","1234");
		
		}catch(Exception e){
			e.printStackTrace();
		}			
	}

	public boolean create(Accident accident) {
		if(this.accidentList.add(accident)) return true;
		return false;
	}

	public boolean delete(Accident accident) {
		if(this.accidentList.remove(accident)) return true;
		else return false;
	}


	public static ArrayList<Accident> getAccidentList() {
		return accidentList;
	}

	public void setAccidentList(ArrayList<Accident> accidentList) {
		this.accidentList = accidentList;
	}
	@Override
	public boolean deleteByName(String name) {
		String query = "delete accident WHERE ID='"+name+"';";		
		try {
			super.delete(query);		
			statement = connect.createStatement();
			if(statement.execute(query)) {
				System.out.println("insert ok");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		
	}
	
	@Override
	public ArrayList<Accident> accidentList(Accident accident) {
		String query =  "select * from accident;";
		try {
			ResultSet rs = this.retrieve(query);
			while(rs.next()) {
				int accidentID = rs.getInt("accidentID");
				int accidentDate = rs.getInt("accidentDate");
				boolean contingency = rs.getBoolean("contingency");
				String doctorNote = rs.getString("doctorNote");
				int damage = rs.getInt("damage");
				int ID = rs.getInt("ID");
				int deadLineDate = rs.getInt("deadLineDate");
				
				accident.setAccidentID(accidentID);
				accident.setAccidentDate(accidentDate);
				accident.setContingency(contingency);
				accident.setDoctorNote(doctorNote);
				accident.setDamage(damage);
				accident.setID(ID);
				accident.setDeadLineDate(deadLineDate);
				
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		return accidentList;
	}
	@Override
	public Accident retrieveById(int accidentID) {
		Accident accident = new  Accident();
		String query = "select * from customer where accidentID='" + accidentID+"';";
		try {
			ResultSet rs = this.retrieve(query);
			while(rs.next()) {
				int accidentDate = rs.getInt("accidentDate");
				boolean contingency = rs.getBoolean("contingency");
				String doctorNote = rs.getString("doctorNote");
				int damage = rs.getInt("damage");
				int ID = rs.getInt("ID");
				int deadLineDate = rs.getInt("deadLineDate");
				
				accident.setAccidentDate(accidentDate);
				accident.setContingency(contingency);
				accident.setDoctorNote(doctorNote);
				accident.setDamage(damage);
				accident.setID(ID);
				accident.setDeadLineDate(deadLineDate);
				
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		return accident;
	}
	
	
}