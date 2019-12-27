package com.tyss.assetmanagement.service;

import java.util.List;

import com.tyss.assetmanagement.dto.AssetAllocationBean;
import com.tyss.assetmanagement.dto.AssetBean;
import com.tyss.assetmanagement.dto.AssetRequestBean;
import com.tyss.assetmanagement.dto.EmployeeBean;
import com.tyss.assetmanagement.dto.UserBean;

public interface AssetService {
 
	public UserBean login(UserBean bean);
	public boolean addAsset(AssetBean asset);
	public boolean modifyAsset(AssetBean asset);
	
	public boolean addEmployee(EmployeeBean bean);
	public boolean raiseRequest(AssetRequestBean assetRequest);
	public List<AssetRequestBean> getAllRequest();
    public List<AssetBean> getAssetRequest();
    public List<AssetAllocationBean> getManagerRequest(int empId);
    public boolean assetAllocation(AssetAllocationBean assetAllocation);
    
}
