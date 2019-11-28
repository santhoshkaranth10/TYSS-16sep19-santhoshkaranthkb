package com.testyantra.empwebapp.dao;

import com.testyantra.empwebapp.dto.EmployeeInfo;

public interface EmployeeDAO {

	public EmployeeInfo auth(int id, String password);//this method will check for the id and password and
	//matches the result in the db.
	
	public EmployeeInfo searchEmployee(int id);
	
	public boolean changePassword(int id,String password);
	
	public boolean registerEmployee(EmployeeInfo info);
	
	//the above are all db operations i.e insert,select,update,delete and not servlet opeartions
}
