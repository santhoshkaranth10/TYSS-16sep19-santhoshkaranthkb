package com.tyss.assetmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyss.assetmanagement.dto.AssetAllocationBean;
import com.tyss.assetmanagement.dto.AssetBean;
import com.tyss.assetmanagement.dto.AssetRequestBean;
import com.tyss.assetmanagement.dto.EmployeeBean;
import com.tyss.assetmanagement.dto.UserBean;
import com.tyss.assetmanagement.repo.AssetAllocationRepo;
import com.tyss.assetmanagement.repo.AssetRepo;
import com.tyss.assetmanagement.repo.AssetRequestRepo;
import com.tyss.assetmanagement.repo.EmployeeRepo;
import com.tyss.assetmanagement.repo.UserRepo;

@Service
public class AssetServiceJpaImpl implements AssetService {

	@Autowired
	private EmployeeRepo repo;
	@Autowired
	private UserRepo repo1;
	@Autowired
	private AssetRepo repo2;
	@Autowired
	private AssetRequestRepo repo3;
	@Autowired
	private AssetAllocationRepo repo4;
	
	
	
	@Override
	public boolean assetAllocation(AssetAllocationBean assetAllocation) {
		 repo4.save(assetAllocation);
          return true;	
	
	}
	@Override
	public boolean addAsset(AssetBean asset) {
	  repo2.save(asset);
	  return true;
	}
	@Override
	public boolean modifyAsset(AssetBean asset) {
		repo2.update(asset.getAssetName(),asset.getAssetDes(),asset.getQuantity(),
				asset.getStatus(),asset.getAssetId());
		return true;
	}
	
	@Override
	public List<AssetBean> getAssetRequest() {
		
		return repo2.findAll();
	}
	@Override
	public boolean addEmployee(EmployeeBean bean) {
		repo.save(bean);
		return true;
	}
	@Override
	public boolean raiseRequest(AssetRequestBean assetRequest) {
		repo3.save(assetRequest);
		return true;
	}
	@Override
	public List<AssetRequestBean> getAllRequest() {
		return repo3.findAll();
		
	}
	@Override
	public UserBean login(UserBean bean) {
		return repo1.autentication(bean.getUserId(), bean.getUserPassword());
	}
	
	
	@Override
	public List<AssetAllocationBean> getManagerRequest(int empId){
		return repo4.findByEmpId(empId);
	}
	
}
