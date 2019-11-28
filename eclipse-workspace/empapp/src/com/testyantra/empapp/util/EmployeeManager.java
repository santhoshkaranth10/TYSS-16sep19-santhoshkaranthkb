package com.testyantra.empapp.util;

import com.testyantra.empapp.dao.EmployeeDAO;
import com.testyantra.empapp.dao.EmployeeDAOImpl;

public class EmployeeManager {

	public static EmployeeDAO getEmployeeDAO() {
		return new EmployeeDAOImpl();
	}
}
