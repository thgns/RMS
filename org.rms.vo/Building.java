package org.rms.vo;

public class Building {
	
	private String type;
	private int size;
	private String addr;
	
	
	public Building(String id, String type, int size, String addr) {
		super();
		this.type = type;
		this.size = size;
		this.addr = addr;
	}


	@Override
	public String toString() {
		return "Building [type=" + type + ", size=" + size
				+ ", addr=" + addr + "]";
	}
	
	
	
	

}
