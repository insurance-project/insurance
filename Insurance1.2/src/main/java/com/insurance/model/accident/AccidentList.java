package com.insurance.model.accident;

import java.util.ArrayList;

public interface AccidentList {
	public boolean create(Accident accident);
	public boolean deleteByName(String name);
	public Accident retrieveById(int accidentID);
	public ArrayList<Accident> accidentList(Accident accident);
}
