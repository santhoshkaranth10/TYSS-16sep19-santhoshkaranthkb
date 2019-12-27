package com.tyss.assetmanagement.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="AssetRequest")
public class AssetRequestBean {

	@Id
	@Column
	@GeneratedValue
	private int requestId;
	@Column
	private String asset_name;
	@Column
	private int empno;
	@Column
	private int userId;
	@Column
	private int quantity;
	@Column
	private String department;
	@Column
	private String asset_desc;
	
	public int getUserId() {
		return userId;
	}
	public void setUser_id(int userId) {
		this.userId = userId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getAsset_desc() {
		return asset_desc;
	}
	public void setAsset_desc(String asset_desc) {
		this.asset_desc = asset_desc;
	}
	public int getRequestId() {
		return requestId;
	}
	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}
	public String getAssetName() {
		return asset_name;
	}
	public void setAssetName(String assetName) {
		this.asset_name = assetName;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	
}
