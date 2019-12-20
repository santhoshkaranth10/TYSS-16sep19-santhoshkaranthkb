package com.tyss.springbootwithhibernate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tyss.springbootwithhibernate.dto.Products_Info;
import com.tyss.springbootwithhibernate.dto.StockResponse;
import com.tyss.springbootwithhibernate.service.StockService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class StockController {
	
	@Autowired
	private StockService service;

	@PostMapping(path="/add",consumes=MediaType.APPLICATION_JSON_VALUE,
			produces=MediaType.APPLICATION_JSON_VALUE)
	public StockResponse addProduct(@RequestBody Products_Info info) {
		StockResponse response  = new StockResponse();
		if(service.addProduct(info)) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("data added to the database");
			
		}else { 
			response.setStatusCode(401);
			response.setMessage("failure");
			response.setDescription("data failed to add to database");
	
		}
		return response;
	}
	
	
	@PutMapping(path="/modify",consumes=MediaType.APPLICATION_JSON_VALUE,
			produces=MediaType.APPLICATION_JSON_VALUE)
	public StockResponse updateProduct(@RequestBody Products_Info info) {
	StockResponse response = new StockResponse();
	if(service.updateProduct(info)) {
		response.setStatusCode(201);
		response.setMessage("success");
		response.setDescription("data modified");
		
	}else {
		response.setStatusCode(401);
		response.setMessage("failure");
		response.setDescription("data failed to add to database");

		
	}
	return response;
}
	
	@GetMapping(path="/get/{name}",
			produces=MediaType.APPLICATION_JSON_VALUE)
    public StockResponse getProductByName(@PathVariable("name")String name) {
		StockResponse response = new StockResponse();
		Products_Info info1 = service.getProductByName(name);
		if(info1!=null) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("got data successfully");
		
		}else {
			response.setStatusCode(401);
			response.setMessage("failure");
			response.setDescription("data not found");
		}
   
		return response;
    	
    }
	
	@GetMapping(path="/get/{category}",
			produces=MediaType.APPLICATION_JSON_VALUE)
    public StockResponse getProductByCategory(@PathVariable("category")String category) {
		StockResponse response = new StockResponse();
		List<Products_Info> info1 = service.getProductByCategory(category);
		if(!info1.isEmpty()) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("got data successfully");
			response.setProducts(info1);
		
		}else {
			response.setStatusCode(401);
			response.setMessage("failure");
			response.setDescription("data not found");
		}
      
		return response;
	}
	

	@GetMapping(path="/get/{company}",
			produces=MediaType.APPLICATION_JSON_VALUE)
    public StockResponse getProductByCompany(@PathVariable("company")String company) {
		StockResponse response = new StockResponse();
		List<Products_Info> info2 = service.getProductByCompany(company);
		if(!info2.isEmpty()) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("got data successfully");
			response.setProducts(info2);
		
		}else {
			response.setStatusCode(401);
			response.setMessage("failure");
			response.setDescription("data not found");
		}
      
		return response;
	}
	
}
	

