package org.rms.vo;

public class TotalSaleInfo {
	
	private String date;
	private Building building;
	private String contactType;
	private int price;
	private int deposit;
	private Customer tenant;
	private Customer host;
	
	public String getDate() {
		return date;
	}
	public Building getBuilding() {
		return building;
	}
	public String getContactType() {
		return contactType;
	}
	public int getPrice() {
		return price;
	}
	public int getDeposit() {
		return deposit;
	}
	public Customer getTenant() {
		return tenant;
	}
	public Customer getHost() {
		return host;
	}
	
	
}
