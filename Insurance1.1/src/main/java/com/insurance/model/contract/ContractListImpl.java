package com.insurance.model.contract;

import java.util.ArrayList;
import java.util.Scanner;

import com.insurance.model.insurance.Insurance;

public class ContractListImpl {
	private ArrayList<Contract> contractList = new ArrayList<Contract>();
	public Insurance m_Insurance;

	public ContractListImpl(){

	}

	public void finalize() throws Throwable {

	}
	
	public  boolean add(Contract contract){
		if(this.contractList.add(contract))return true;
		else return false;
	}

	public boolean delete(Contract contract){
		if(this.contractList.remove(contract))return true;
		else return false;
	}	
	
	public ArrayList<Contract> getContractList() {
		return contractList;
	}

	public void setContractList(ArrayList<Contract> contractList) {
		this.contractList = contractList;
	}
	
	public Contract selectContract() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		return contractList.get(a-1);
	}

}
