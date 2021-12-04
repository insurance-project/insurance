package com.insurance.model.insuranceKind;

import com.insurance.model.insurance.Insurance;

public class MedicalInsurance extends Insurance {
	
	public MedicalInsurance() {
		
	}
	
	public void CalculatePredictProfit(float rewardRatio)
	{
		int totalProfit;
		int subLife;
		subLife = super.getPredictProfit().getSubscribers()*
				(80-(super.getAllowStandard().getCustomerMaxAge()+super.getAllowStandard().getCustomerMinAge()/2));
		totalProfit = (int)(super.getPremium()*subLife
					- super.getRewardCost()*rewardRatio*subLife);
		// �����*���󱸵��ڼ�*��հ��ԱⰣ - �����*����Ȯ��*���󱸵��ڼ�*��հ��ԱⰣ
		super.getPredictProfit().setTotalProfit((int)totalProfit);
	}	
		
	public void CalculatePremium(int diseaseGrade)
	{
		switch(diseaseGrade)
		{
		case 0:
			super.setPremium((int)(super.getPremium()));
			break;
		case 1:
			super.setPremium((int)(super.getPremium()*(1+0.1*super.getPremiumRate())));
			break;
		case 2:
			super.setPremium((int)(super.getPremium()*(1+0.2*super.getPremiumRate())));
			break;
		}
	}
	
	public void CalculateReward(int diseaseGrade)
	{
		switch(diseaseGrade)
		{
		case 0:
			super.setRewardCost((int)(super.getRewardCost()));
			break;
		case 1:
			super.setRewardCost((int)(super.getRewardCost()*(1+0.1*super.getRewardRate())));
			break;
		case 2:
			super.setRewardCost((int)(super.getRewardCost()*(1+0.2*super.getRewardRate())));
			break;
		}
	}
	
}
