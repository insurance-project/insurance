package com.insurance.model.accident;

public class Reward {
	private int rewardID;
	private String rewardDate;
	private int rewardPrice;
	private int ID; // 사용 x
	public double rewardRate =1.0; // 사용 x
	public int getRewardID() {
		return rewardID;
	}
	public void setRewardID(int rewardID) {
		this.rewardID = rewardID;
	}
	public String getRewardDate() {
		return rewardDate;
	}
	public void setDate(String rewardDate) {
		this.rewardDate = rewardDate;
	}
	public int getRewardPrice() {
		return rewardPrice;
	}
	public void setRewardPrice(int rewardPrice) {
		this.rewardPrice = rewardPrice;
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
