package com.insurance.model.insurance;

public class SalePerform { // 판매 실적 열람하기
	private int profit;
	private int subscribers;
	private int totalProfit;
	private int salePerformID;


	public SalePerform()
	{
		profit = 0;
		subscribers = 0;
		totalProfit = 0;
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
	
	public void PlusSalePerform(Insurance ins)
	{
		profit = ins.getPremium();
		subscribers++;
		totalProfit +=profit;
	}

	public int getSalePerformID() {
		return salePerformID;
	}

	public void setSalePerformID(int salePerformID) {
		this.salePerformID = salePerformID;
	}


}
