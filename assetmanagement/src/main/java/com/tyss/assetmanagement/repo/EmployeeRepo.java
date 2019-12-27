package com.tyss.assetmanagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tyss.assetmanagement.dto.EmployeeBean;

public interface EmployeeRepo extends JpaRepository<EmployeeBean, Integer>{

}
