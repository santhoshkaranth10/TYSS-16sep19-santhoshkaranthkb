package com.tyss.assetmanagement.dto;

import java.util.List;

public class Response {

	private int statusCode;
	private String message;
	private String description;
	private List<AssetBean> asset;
	private List<AssetRequestBean> assetRequest;
	public List<AssetAllocationBean> assetAllocation;
	private String usertype;
	
	public List<AssetAllocationBean> getAssetAllocation() {
		return assetAllocation;
	}
	public void setAssetAllocation(List<AssetAllocationBean> assetAllocation) {
		this.assetAllocation = assetAllocation;
	}
	
	
	
	public List<AssetRequestBean> getAssetRequest() {
		return assetRequest;
	}
	public void setAssetRequest(List<AssetRequestBean> assetRequest) {
		this.assetRequest = assetRequest;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<AssetBean> getAsset() {
		return asset;
	}
	public void setAsset(List<AssetBean> asset) {
		this.asset = asset;
	}
	public String getUsertype() {
		return usertype;
	}
	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}
}
