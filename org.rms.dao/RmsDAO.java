package org.rms.dao;

import org.rms.vo.Building;
import org.rms.vo.Customer;
import org.rms.vo.SaleInfo;

public interface RmsDAO {
	
	public abstract String registBuilding(Building building);
	
	public abstract boolean registCustomer(Customer customer);
	
	public abstract boolean registSaleInfo(SaleInfo saleInfo);
	

}
