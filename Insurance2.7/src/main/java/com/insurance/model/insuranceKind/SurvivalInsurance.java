package com.insurance.model.insuranceKind;

import com.insurance.model.insurance.Insurance;

public class SurvivalInsurance extends Insurance {	
	
	private int endAge;
	
	public SurvivalInsurance() {
		
	}	
	
	public void CalculatePredictProfit(float rewardRatio)
	{
		int totalProfit;
		int subLife;
		subLife = super.getPredictProfit().getSubscribers()*
				(endAge-(super.getAllowStandard().getCustomerMaxAge()+super.getAllowStandard().getCustomerMinAge()/2));
		totalProfit = (int)(super.getPremium()*subLife
					- super.getRewardCost()*rewardRatio*subLife);
		// �����*���󱸵��ڼ�*��հ��ԱⰣ - �����*����Ȯ��*���󱸵��ڼ�*��հ��ԱⰣ
		super.getPredictProfit().setTotalProfit((int)totalProfit);
		System.out.println("��������");
	}	
	
	public void CalculateReward(int age)
	{
		super.setRewardCost(super.getPremium()*(endAge-age));
	}

	public int getEndAge() {
		return endAge;
	}

	public void setEndAge(int endAge) {
		this.endAge = endAge;
	}

	
}
