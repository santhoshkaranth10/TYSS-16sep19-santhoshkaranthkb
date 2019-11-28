package com.testyantra.empwebapp.util;

import com.testyantra.empwebapp.dao.EmployeeDAO;
import com.testyantra.empwebapp.dao.EmployeeDaoJdbcImpl;

public class EmployeeDaoManager {

	private EmployeeDaoManager() { //private because it has only one method and is static
		
	}
	public static EmployeeDAO getEmployeeDAO() {
		return new EmployeeDaoJdbcImpl();
	}
}
