package com.tyss.assetmanagement.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="Employee")
public class EmployeeBean {

	@Id
	@Column
	@GeneratedValue
	private int empId;
	@Column
	private String ename;
	@Column
	private String job;
	@Column
	private int mgr;
	@Column
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date hireDate;
	@Column
	private int dept_Id;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getMgr() {
		return mgr;
	}
	public void setMgr(int mgr) {
		this.mgr = mgr;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	public int getDeptId() {
		return dept_Id;
	}
	public void setDeptId(int deptId) {
		this.dept_Id = deptId;
	}
	
	
	

	
	
}
