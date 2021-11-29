package com.insurance.model.insurance;


public class Insurance {

	//Attributes
	private int insuranceID;	
//	private enum eInsKind{CAR,DEATH,FIRE,MEDICAL,MIXED,SURVIVAL};
//	private eInsKind eKind;
	private String insuranceName;
	private String kind; // 보험 종류
	private int premium; // 기본 보험료
	private int warranty; // 보장기간
	private int rewardCost; //보상 지급 금액
	private float premiumRate; // 보험 요율
	private float rewardRate; // 보상금 지급시 사용
	private int salePerformID;
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
	
	public int getInsuranceID() {
		return insuranceID;
	}

	public void setInsuranceID(int insuranceID) {
		this.insuranceID = insuranceID;
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

	
	
	public void setEndAge(int endAge) {
		// TODO Auto-generated method stub
		
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
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

	public int getSalePerformID() {
		return salePerformID;
	}

	public void setSalePerformID(int salePerformID) {
		this.salePerformID = salePerformID;
	}
	
	
	
}