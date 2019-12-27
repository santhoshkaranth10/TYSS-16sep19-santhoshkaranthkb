package com.tyss.assetmanagement.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="Asset_Allocation")
public class AssetAllocationBean {

	@Id
	@Column
	@GeneratedValue
	private int allocationId;
	@Column
	private int assetId;
	@Column
	private int empId;
	@Column
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date allocation_date;
	@Column
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date release_date;
	@Column
	private int requestid;
	@Column
	private String assetname;
	@Column
	private String status;
	
	
	
	public int getRequestid() {
		return requestid;
	}
	public void setRequestid(int requestid) {
		this.requestid = requestid;
	}
	public String getAssetname() {
		return assetname;
	}
	public void setAssetname(String assetname) {
		this.assetname = assetname;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getAllocationId() {
		return allocationId;
	}
	public void setAllocationId(int allocationId) {
		this.allocationId = allocationId;
	}
	public int getAssetId() {
		return assetId;
	}
	public void setAssetId(int assetId) {
		this.assetId = assetId;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public Date getAllocation_date() {
		return allocation_date;
	}
	public void setAllocation_date(Date allocation_date) {
		this.allocation_date = allocation_date;
	}
	public Date getRelease_date() {
		return release_date;
	}
	public void setRelease_date(Date release_date) {
		this.release_date = release_date;
	}
}
