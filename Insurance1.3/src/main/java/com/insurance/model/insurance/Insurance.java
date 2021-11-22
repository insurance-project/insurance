package com.insurance.model.insurance;

import com.insurance.model.customer.Customer;

public class Insurance implements Cloneable {

	//Attributes
	private int id;	
	private enum eInsKind{CAR,DEATH,FIRE,MEDICAL,MIXED,SURVIVAL};
	private eInsKind eKind;
	private String insuranceName;
	private int kind;
	private int premium;
	private int warranty;
	private int rewardCost;
	private float premiumRate;
	private float rewardRate;
	private boolean apply;
	private boolean allow;
	//public SaleTarget m_SaleTarget;
	//public AllowStandard m_AllowStandard;
	//public SalePerform m_SalePerform;
	//public PredictProfit m_PredictProfit;
	
	//Composition Class
	private AllowStandard allowStandard = new AllowStandard();	
	private PredictProfit predictProfit = new PredictProfit();
	private SalePerform salePerform = new SalePerform();
	
	public Insurance()
	{
		apply = false;
		allow = false;
	}
	
	 public Object clone() throws CloneNotSupportedException{
	    	//CloneNotSupportedException ó��
	    	return super.clone();
	    }

	public boolean isApply() {
		return apply;
	}

	public void setApply(boolean apply) {
		this.apply = apply;
	}


	public String getInsuranceName() {
		return insuranceName;
	}

	public void setInsuranceName(String insuranceName) {
		this.insuranceName = insuranceName;
	}

	public int getPremium() {
		return premium;
	}

	public void setPremium(int premium) {
		this.premium = premium;
	}

	public int getWarranty() {
		return warranty;
	}

	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}

	public int getRewardCost() {
		return rewardCost;
	}

	public void setRewardCost(int rewardCost) {
		this.rewardCost = rewardCost;
	}	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public AllowStandard getAllowStandard() {
		return allowStandard;
	}

	public void setAllowStandard(AllowStandard allowStandard) {
		this.allowStandard = allowStandard;
	}

	public PredictProfit getPredictProfit() {
		return predictProfit;
	}

	public void setPredictProfit(PredictProfit predictProfit) {
		this.predictProfit = predictProfit;
	}

	public SalePerform getSalePerform() {
		return salePerform;
	}

	public void setSalePerform(SalePerform salePerform) {
		this.salePerform = salePerform;
	}
	
	public void finalize() throws Throwable {

	}

	public void Reward(){

	}

	public boolean isAllow() {
		return allow;
	}

	public void setAllow(boolean allow) {
		this.allow = allow;
	}

	public boolean setInsKind(int kind) {	
		switch(kind)
		{
			case 1:
				this.eKind = eKind.CAR;
				break;
			case 2:
				this.eKind = eKind.DEATH;
				break;
			case 3:
				this.eKind = eKind.FIRE;
				break;
			case 4:
				this.eKind = eKind.MEDICAL;
				break;
			case 5:
				this.eKind = eKind.MIXED;
				break;
			case 6:
				this.eKind = eKind.SURVIVAL;
			default:
				System.out.println("�߸��� ���ڸ� �Է��ϼ̽��ϴ�.");
				return false;						
		}
		return true;
	}
	
	public void PrintInsuranceInfo()
	{
		System.out.println("�����̸�:"+this.insuranceName);		
		String sKind = null;
		switch(this.kind)
		{
		case 1:
			sKind = "����";
			break;
		case 2:
			sKind = "���";
			break;
		case 3:
			sKind = "ȥ��";
			break;
		case 4:
			sKind = "�ڵ���";
			break;
		case 5:
			sKind = "ȭ��";
			break;
		case 6:
			sKind = "�Ƿ�";
			break;
		}
		System.out.println("��������:"+sKind);		
		System.out.println("�����"+this.premium);
		System.out.println("�������"+this.premiumRate);
		System.out.println("�������"+this.rewardRate);		
		System.out.println("����Ⱓ"+this.warranty);
		System.out.println("����ݾ�"+this.rewardCost);	
	}	
	
	public boolean CheckKindIns()
	{
		if(this.getKind()>=4&&this.getKind()<=6)
			return false;
		else
			return true;//true=������ false=���غ���
	}		
	
	public boolean JudgeInsurance(Customer cus)
	{
		if(this.getAllowStandard().getCustomerMinAge()>cus.getCustomerAge()||this.getAllowStandard().getCustomerMaxAge()<cus.getCustomerAge())
			return false;//����üũ

		if(this.getAllowStandard().getCustomerGender()!=3)
		{
			if(this.getAllowStandard().getCustomerGender()!=cus.getCustomerGender())
				return false;//����üũ
		}
		
		if(this.getAllowStandard().getCustomerIncome()>cus.getIncome())
			return false;//�ҵ����üũ
		
		return true;
	}
	
	public void setEndAge(int endAge) {
		// TODO Auto-generated method stub
		
	}

	public int getKind() {
		return kind;
	}

	public void setKind(int kind) {
		this.kind = kind;
	}

	public float getPremiumRate() {
		return premiumRate;
	}

	public void setPremiumRate(float premiumRate) {
		this.premiumRate = premiumRate;
	}

	public float getRewardRate() {
		return rewardRate;
	}

	public void setRewardRate(float rewardRate) {
		this.rewardRate = rewardRate;
	}

	public void CalculatePredictProfit(float rewardRatio) {	
		System.out.println("�ȵ�");
	}
	
}