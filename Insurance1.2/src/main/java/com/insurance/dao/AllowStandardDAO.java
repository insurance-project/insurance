package com.insurance.dao;

import com.insurance.model.insurance.AllowStandard;

public interface AllowStandardDAO {
	public void create(AllowStandard allowStandard,int id);
	public void deleteAll();
	public void deleteByName(String name);
	public AllowStandard retrieveById(int allowId);
}
