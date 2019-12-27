package com.tyss.assetmanagement.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="asset")
public class AssetBean {

	@Id
	@Column
	@GeneratedValue
	private int assetId;
	@Column
	private String asset_name;  //change it
	@Column
	private int Quantity;
	@Column
	private String assetDes;
	@Column
	private String status;
	
	public int getAssetId() {
		return assetId;
	}
	public void setAssetId(int assetId) {
		this.assetId = assetId;
	}
	public String getAssetName() {
		return asset_name;
	}
	public void setAssetName(String asset_name) {
		this.asset_name = asset_name;
	}
	public String getAssetDes() {
		return assetDes;
	}
	public void setAssetDes(String assetDes) {
		this.assetDes = assetDes;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
