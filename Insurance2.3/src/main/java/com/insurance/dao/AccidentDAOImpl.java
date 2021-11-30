package com.insurance.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.insurance.model.accident.Accident;

public class AccidentDAOImpl  extends DAO implements AccidentDAO {

	private ArrayList<Accident> accidentList = new ArrayList<Accident>();

		Connection connect = null;
		Statement statement = null;
		ResultSet rs = null;
		PreparedStatement psmt= null;
		int no;

	public AccidentDAOImpl() {
		try {
			super.connect();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void create(Accident accident) {
		String query = "insert into accident(accidentID, kind, date, Contingency, doctorNote, damage, ID) values ("+
						"0, '" + accident.getInskind()+"', '"+
								accident.getAccidentDate()+"',"+
								accident.getContingency()+", '"+
								accident.getDoctorNote()+"',"+
								accident.getDamage()+","+
								accident.getID()+");";
		
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
	public void deleteByName(String Name) {
		String query = "delete accident WHERE ID='"+Name+"';";		
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
	public ArrayList<Accident> accidentList(Accident accident) {
		ArrayList<Accident> list = new ArrayList<Accident>();
		String query = "select * from Accident;";
		try {
			ResultSet rs = super.retrieve(query);
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
				accident.setDamagePrice(damage);
				accident.setID(ID);
				accident.setDeadLineDate(deadLineDate);
				
			}
				
		}catch(Exception e) {
		e.printStackTrace();
	}
		return list;

	}
	@Override
	public Accident retrieveById(int accidentID) {
		// TODO Auto-generated method stub
		Accident accident = new Accident();
		String query = "select * from accident where id= "+ accidentID;
		try {
			ResultSet rs = super.retrieve(query);
			while(rs.next()) {
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
				accident.setDamagePrice(damage);
				accident.setID(ID);
				accident.setDeadLineDate(deadLineDate);
				
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		return accident;
	}

	

}
