package com.tyss.springbootwithhibernate.dto;

import java.util.List;

public class StockResponse {

	private int statusCode;
	private String message;
	private String description;
	private List<Products_Info> products;
	
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<Products_Info> getProducts() {
		return products;
	}
	public void setProducts(List<Products_Info> products) {
		this.products = products;
	}
}
