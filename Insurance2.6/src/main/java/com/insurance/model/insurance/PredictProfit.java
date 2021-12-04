package com.insurance.model.insurance;

public class PredictProfit {

	private int profit; // 이익 = 보험료
	private int subscribers; // 예상 가입자수
	private int totalProfit; // profit * subscribers
	private int predictProfitID;
	
	
	public int getPredictProfitID() {
		return predictProfitID;
	}

	public void setPredictProfitID(int predictProfitID) {
		this.predictProfitID = predictProfitID;
	}

	public PredictProfit()
	{
		
	}
	
	public int getProfit() {
		return profit;
	}

	public void setProfit(int profit) {
		this.profit = profit;
	}

	public int getSubscribers() {
		return subscribers;
	}

	public void setSubscribers(int subscribers) {
		this.subscribers = subscribers;
	}

	public int getTotalProfit() {
		return totalProfit;
	}

	public void setTotalProfit(int totalProfit) {
		this.totalProfit = totalProfit;
	}	

}
