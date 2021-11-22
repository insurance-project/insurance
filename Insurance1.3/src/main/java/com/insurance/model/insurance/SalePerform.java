package com.insurance.model.insurance;

public class SalePerform {
	private int profit;
	private int subscribers;
	private int totalProfit;
	
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

}
