package org.rms.vo;

public class Customer {
	
	private String name;
	private int phoneNumber;
	
	public Customer(String id, String name, int phoneNumber) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", phoneNumber="
				+ phoneNumber + "]";
	}
	
	
	
	
}
