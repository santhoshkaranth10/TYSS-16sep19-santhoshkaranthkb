package com.tyss.assetmanagement.repo;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.tyss.assetmanagement.dto.UserBean;

public interface UserRepo extends JpaRepository<UserBean, Integer>{

	
	@Transactional
	@Query("from UserBean  where userId=:userId and userPassword=:userPassword")
	public UserBean autentication(@Param("userId")int userId, @Param("userPassword") String userPassword);
	
	
	
	
}
