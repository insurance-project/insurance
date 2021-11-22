package com.insurance.model.accident;



import com.insurance.model.customer.Customer;

public class Accident {
	private int accidentID;
	private enum eInsKind{Car, Death, Fire,Medical, MixedLife,Survival};
	private eInsKind eKind;
	private int accidentDate;
	private int deadLineDate = accidentDate+7;
	private int kind;
	private int damage;
	private boolean Contingency;
	private Customer customer;
	private String doctorNote;
	private int ID;
	
	
	public int getAccidentID() {
		return accidentID;
	}
	public void setAccidentID(int accidentID) {
		this.accidentID = accidentID;
	}
	
	public int getAccidentDate() {
		return accidentDate;
	}
	public void setAccidentDate(int accidentDate) {
		this.accidentDate = accidentDate;
	}
	public int getDeadlineDate() {
		return deadLineDate;
	}
	public void setDeadLineDate(int deadLineDate) {
		this.deadLineDate = deadLineDate;
		
	}
	public int getDamage() {
		return damage;
	}
	public void setDamage(int damage) {
		this.damage = damage;
	}
	public boolean isContingency() {
		return Contingency;
	}
	public void setContingency(boolean contingency) {
		this.Contingency = contingency;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public String getDoctorNote() {
		return doctorNote;
	}
	public void setDoctorNote(String doctorNote) {
		this.doctorNote = doctorNote;
	}
	public int getKind() {
		return kind;
	}

	public void setKind(int kind) {
		this.kind = kind;
	}
	public boolean setContingency(int cont) {
		switch(cont) {
		case 1:
			this.Contingency=true;
		case 2:
			this.Contingency=false;
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			return false;
		}
	}
	public boolean getContingency() {
		return this.Contingency;
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
	
}
