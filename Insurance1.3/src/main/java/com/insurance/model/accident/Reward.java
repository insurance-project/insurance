package com.insurance.model.accident;

public class Reward {
	private int rewardID;
	private int date;
	private int price;
	private int ID;
	public double rewardRate =1.0;
	public int getRewardID() {
		return rewardID;
	}
	public void setRewardID(int rewardID) {
		this.rewardID = rewardID;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getID() {
		return ID;
	}
	public void setID(int ID) {
		this.ID = ID;
	}
	public double getRewardRate() {
		return rewardRate;
	}
	public void setRewardRate(double rewardRate) {
		this.rewardRate = rewardRate;
	}
	
	
}
