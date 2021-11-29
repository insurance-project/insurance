package com.insurance.dao;

import java.util.ArrayList;

import com.insurance.model.accident.Accident;

public interface AccidentDAO {

	public void create(Accident accident);
	public void deleteByName(String name);
	public Accident retrieveById(int accidentID);
	public ArrayList<Accident> accidentList(Accident accident);

}
