package com.insurance.model.insuranceKind;

import com.insurance.model.insurance.Insurance;

public class MixedLifeInsurance extends Insurance {
	
	private int endAge;
	
	public MixedLifeInsurance() {
		
	}

	public void CalculatePredictProfit(float rewardRatio)
	{
		int totalProfit;
		int subLife;
		subLife = super.getPredictProfit().getSubscribers()*
				((80+endAge)/2-(super.getAllowStandard().getCustomerMaxAge()+super.getAllowStandard().getCustomerMinAge()/2));
		totalProfit = (int)(super.getPremium()*subLife
					- super.getRewardCost()*rewardRatio*subLife);
		// �����*���󱸵��ڼ�*��հ��ԱⰣ - �����*����Ȯ��*���󱸵��ڼ�*��հ��ԱⰣ
		super.getPredictProfit().setTotalProfit((int)totalProfit);
	}	
	
	public void CalculatePremium(int age)
	{
		if(age>=20&&age<30)
			super.setPremium(super.getPremium());
		else if(age>=30&&age<40)
			super.setPremium((int)(super.getPremium()*(1+0.1)));
		else if(age>=40&&age<50)
			super.setPremium((int)(super.getPremium()*(1+0.2)));
		else if(age>=50&&age<60)
			super.setPremium((int)(super.getPremium()*(1+0.3)));
		else if(age>=60&&age<70)
			super.setPremium((int)(super.getPremium()*(1+0.4)));
		else if(age>=70&&age<80)
			super.setPremium((int)(super.getPremium()*(1+0.5)));
		else
			System.out.println("���� ���̰� ������ ������ϴ�");
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
