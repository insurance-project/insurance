package com.insurance.dao;

import java.util.List;

import com.insurance.dto.AllowStandardDTO;
import com.insurance.model.insurance.AllowStandard;

public interface AllowStandardDAO {
	public void InsertAllowStandard(AllowStandard AllowStandard) throws Exception;
	public void DeleteAllowStandard(int AllowStandardID) throws Exception;
	public List<AllowStandardDTO> NonAllowStandardInsuranceList() throws Exception;
	public AllowStandard SelectAllowStandardInfo(int AllowStandardID) throws Exception;
}
