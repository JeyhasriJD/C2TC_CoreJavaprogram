package com.tnsif.constructorassignment;

public class Customer {
	
	private int CId;
	private String CName;
	private String CCity;
	
	public Customer()
	{
		this.CId=142;
		this.CName="MOHAN";
		this.CCity="VILLUPURAM";
	}
	
	public Customer(int cId, String cName, String cCity) {
		this.CId = cId;
		this.CName = cName;
		this.CCity = cCity;
	}

	public int getCId() {
		return CId;
	}
	public void setCId(int cId) {
		CId = cId;
	}
	public String getCName() {
		return CName;
	}
	public void setCName(String cName) {
		CName = cName;
	}
	public String getCCity() {
		return CCity;
	}
	public void setCCity(String cCity) {
		CCity = cCity;
	}
	@Override
	public String toString() {
		return "Customer [Id=" + CId + ", Name=" + CName + ", City=" + CCity + "]";
	}
	

}
