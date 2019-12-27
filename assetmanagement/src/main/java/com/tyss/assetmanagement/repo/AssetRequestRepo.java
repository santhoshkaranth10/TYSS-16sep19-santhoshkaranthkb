package com.tyss.assetmanagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tyss.assetmanagement.dto.AssetRequestBean;

public interface AssetRequestRepo extends JpaRepository<AssetRequestBean, Integer> {

}
