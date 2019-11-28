package com.testyantra.empwebapp.dto;

import lombok.Data;

@Data
public class EmployeeInfo {

	private int id;
	private String name;
	private String email;
	//@Exclude in lombok  is used to hide the password
	private String password;
	
}
