package com.tyss.assetmanagement.repo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.tyss.assetmanagement.dto.AssetAllocationBean;

public interface AssetAllocationRepo extends JpaRepository<AssetAllocationBean, Integer> {

	@Transactional
	@Modifying
	@Query("from AssetAllocationBean where empId=:empId")
     public List<AssetAllocationBean> findByEmpId(@Param("empId")int empId);
}
