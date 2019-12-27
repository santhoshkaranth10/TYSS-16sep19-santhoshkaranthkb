package com.tyss.assetmanagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tyss.assetmanagement.dto.DepartmentBean;

public interface DepartmentRepo extends JpaRepository<DepartmentBean, Integer> {

}
