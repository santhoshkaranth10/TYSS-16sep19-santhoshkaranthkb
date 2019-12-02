package com.tyss.empspringmvcassessment.dao;

import com.tyss.empspringmvcassessment.dto.Product;
import com.tyss.empspringmvcassessment.dto.RetailerBean;

public interface RetailerDAO {

	public RetailerBean login(int id,String password);
	public int register(RetailerBean bean);
    public Product searchProduct(int id);
    public boolean changePassword(int id,String password);
    
	
}
