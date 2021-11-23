package com.insurance.model.insuranceKind;

import com.insurance.model.insurance.Insurance;

public class DeathInsurance extends Insurance {	


	public DeathInsurance() {
		
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
	
	public void CalculatePremium(int age)
	{
		if(age>=20&&age<30)
			super.setPremium((int)(super.getPremium()));
		else if(age>=30&&age<40)
			super.setPremium((int)(super.getPremium()*(1+0.05*super.getPremiumRate())));
		else if(age>=40&&age<50)
			super.setPremium((int)(super.getPremium()*(1+0.1*super.getPremiumRate())));
		else if(age>=50&&age<60)
			super.setPremium((int)(super.getPremium()*(1+0.15*super.getPremiumRate())));
		else if(age>=60&&age<70)
			super.setPremium((int)(super.getPremium()*(1+0.2*super.getPremiumRate())));
		else if(age>=70&&age<80)
			super.setPremium((int)(super.getPremium()*(1+0.25*super.getPremiumRate())));
		else
			System.out.println("���� ���̰� ������ ������ϴ�");
	}

	public void CalculateReward(int age,int deathAge)
	{		
		super.setRewardCost(super.getPremium()*(deathAge-age));		
	}
	

}
