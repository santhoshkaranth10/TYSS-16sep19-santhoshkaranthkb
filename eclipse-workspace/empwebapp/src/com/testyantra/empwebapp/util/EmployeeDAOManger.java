package com.testyantra.empwebapp.util;

import com.testyantra.empwebapp.dao.EmployeeDAO;
import com.testyantra.empwebapp.dao.EmployeeDAOJdbcImpl;

public class EmployeeDAOManger {

	private EmployeeDAOManger() {	}

	public static EmployeeDAO getEmolyeeDao() {
		return (EmployeeDAO) new EmployeeDAOJdbcImpl();
	}

}
