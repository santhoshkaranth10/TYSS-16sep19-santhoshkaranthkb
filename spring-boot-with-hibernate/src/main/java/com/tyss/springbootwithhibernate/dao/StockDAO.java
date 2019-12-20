package com.tyss.springbootwithhibernate.dao;

import java.util.List;

import com.tyss.springbootwithhibernate.dto.Products_Info;

public interface StockDAO {

	public boolean addProduct(Products_Info info);
	public boolean updateProduct(Products_Info info);
	public Products_Info getProductByName(String name);
	public List<Products_Info> getProductByCategory(String category);
	public List<Products_Info> getProductByCompany(String company);
	
	
	
}
