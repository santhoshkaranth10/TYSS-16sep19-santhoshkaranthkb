package com.tyss.springbootwithhibernate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyss.springbootwithhibernate.dao.StockDAO;
import com.tyss.springbootwithhibernate.dto.Products_Info;
@Service
public class StockServiceImpl implements StockService {

	@Autowired
	private StockDAO dao;
	
	@Override
	public boolean addProduct(Products_Info info) {
		
		return dao.addProduct(info);
	}

	

	@Override
	public boolean updateProduct(Products_Info info) {
	
		return dao.updateProduct(info);
	}



	@Override
	public Products_Info getProductByName(String name) {
		
		return dao.getProductByName(name);
	}

	@Override
	public List<Products_Info> getProductByCategory(String category) {
		
		return dao.getProductByCategory(category);
	}

	@Override
	public List<Products_Info> getProductByCompany(String company) {
		
		return dao.getProductByCompany(company);
	}

	
}
