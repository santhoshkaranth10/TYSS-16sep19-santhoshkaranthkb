package com.tyss.assetmanagement.repo;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.tyss.assetmanagement.dto.AssetBean;

public interface AssetRepo extends JpaRepository<AssetBean, Integer> {


	@Transactional
	@Modifying(clearAutomatically = true)
	@Query("update AssetBean set asset_name=:asset_name,assetDes=:assetDes,Quantity=:Quantity,"
			+ "status=:status where assetId=:assetId")
	public void update(@Param("asset_name")String asset_name, @Param("assetDes")String assetDes, 
			@Param("Quantity")int Quantity, 
			@Param("status") String status,@Param("assetId")int assetId);

	
}
