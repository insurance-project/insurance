package com.insurance.model.accident;



import com.insurance.model.customer.Customer;

public class Accident {
	private int accidentID;
	private enum eInsKind{Car, Death, Fire,Medical, MixedLife,Survival}; //
	private eInsKind eKind;
	private String accidentDate;
//	private int deadLineDate = accidentDate+7; //사용 안함
	private String accidentKind; // 사고 종류 (자동차 사고, 화재 사고, ...)
	private int damagePrice; // 손해 금액
	private boolean contingency; // 고의성 유무
	private int customerID;
	private String doctorNote; // 사용 안함
	private int ID; // 사용 안함
	private int rewardID;
	
	
	public int getAccidentID() {
		return accidentID;
	}
	public void setAccidentID(int accidentID) {
		this.accidentID = accidentID;
	}
	
	public String getAccidentDate() {
		return accidentDate;
	}
	public void setAccidentDate(String accidentDate) {
		this.accidentDate = accidentDate;
	}
//	public int getDeadlineDate() {
//		return deadLineDate;
//	}
//	public void setDeadLineDate(int deadLineDate) {
//		this.deadLineDate = deadLineDate;
//		
//	}
	public int getDamage() {
		return damagePrice;
	}
	public void setDamagePrice(int damagePrice) {
		this.damagePrice = damagePrice;
	}
	public boolean isContingency() {
		return contingency;
	}
	public void setContingency(boolean contingency) {
		this.contingency = contingency;
	}
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getDoctorNote() {
		return doctorNote;
	}
	public void setDoctorNote(String doctorNote) {
		this.doctorNote = doctorNote;
	}
	public String getAccidentKind() {
		return accidentKind;
	}

	public void setAccidentKind(String accidentKind) {
		this.accidentKind = accidentKind;
	}
	public boolean setContingency(int cont) {
		switch(cont) {
		case 1:
			this.contingency=true;
		case 2:
			this.contingency=false;
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			return false;
		}
	}
	public boolean getContingency() {
		return this.contingency;
	}
	public String getInskind() {
		return eKind.name();
	}
	public boolean setInsKind(int kind) {	
		switch(kind)
		{
			case 1:
				this.eKind = eKind.Survival;
				break;
			case 2:
				this.eKind = eKind.Death;
				break;
			case 3:
				this.eKind = eKind.MixedLife;
				break;
			case 4:
				this.eKind = eKind.Car;
				break;
			case 5:
				this.eKind = eKind.Fire;
				break;
			case 6:
				this.eKind = eKind.Medical;
			default:
				System.out.println("�߸��� ���ڸ� �Է��ϼ̽��ϴ�.");
				return false;						
		}
		return true;
	}
	public int getID() {
		return ID;
	}
	public void setID(int ID) {
		this.ID = ID;
	}
	public int getRewardID() {
		return rewardID;
	}
	public void setRewardID(int rewardID) {
		this.rewardID = rewardID;
	}
	
}
