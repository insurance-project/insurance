package com.insurance.model.insuranceKind;

import com.insurance.model.insurance.Insurance;

public class FireInsurance extends Insurance {
		
	public FireInsurance() {
		
	}
	
	public void CalculatePredictProfit(float rewardRatio)
	{
		int totalProfit;
		int subWar;
		subWar = super.getPredictProfit().getSubscribers()*super.getWarranty();
		totalProfit = (int)(super.getPremium()*subWar
					- super.getRewardCost()*rewardRatio*subWar);
		// �����*���󱸵��ڼ�*����Ⱓ - �����*����Ȯ��*���󱸵��ڼ�*����Ⱓ
		super.getPredictProfit().setTotalProfit((int)totalProfit);
	}	
	
	public void CalculatePremium(int buildingGrade)
	{
		switch(buildingGrade)
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
	
	public void CalculateReward(int buildingGrade)
	{
		switch(buildingGrade)
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
