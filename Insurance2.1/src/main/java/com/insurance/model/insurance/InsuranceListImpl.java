package com.insurance.model.insurance;
import java.util.ArrayList;
import java.util.Scanner;

public class InsuranceListImpl implements InsuranceList {

	private ArrayList<Insurance> insuranceList = new ArrayList<Insurance>();
	public Insurance m_Insurance;

	public InsuranceListImpl(){

	}

	public void finalize() throws Throwable {

	}
	
	public boolean add(Insurance insurance){
		if(this.insuranceList.add(insurance))return true;
		else return false;
	}

	public boolean delete(Insurance insurance){
		if(this.insuranceList.remove(insurance))return true;
		else return false;
	}
	
//	public Insurance search(int insuranceId){
//		for(Insurance insurance : this.insuranceList)
//		{
//			if(insurance.getKind() == insuranceId)
//				return insurance;
//		}
//		return null;
//	}
//
//	public void update(int id,String name,String desc,int premium,int warranty,int rewardCo){
//		delete(search(id));
//		Insurance ins = new Insurance();
//		ins.setKind(id);
//		ins.setInsuranceName(name);		
//		ins.setPremium(premium);
//		ins.setWarranty(warranty);
//		ins.setRewardCost(rewardCo);
//		add(ins);
//	}
	
	public void printInsuranceList() {
		int a = 1;		
		for(Insurance insurance : this.insuranceList)
		{						
			System.out.println(a+"."+insurance.getInsuranceName());
			a++;
		}
	}
	
	public Insurance selectInsurance()
	{		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		return insuranceList.get(a-1);
	}	

	public ArrayList<Insurance> getInsuranceList() {
		return insuranceList;
	}

	public void setInsuranceList(ArrayList<Insurance> insuranceList) {
		this.insuranceList = insuranceList;
	}	

}