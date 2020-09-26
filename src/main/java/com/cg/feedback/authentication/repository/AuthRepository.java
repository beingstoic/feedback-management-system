package com.cg.feedback.authentication.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.feedback.authentication.entity.ERole;
import com.cg.feedback.authentication.entity.User;

@Repository
public interface AuthRepository  extends JpaRepository<User, Long>{

	User findByUserName(String username);

	boolean existsByUserName(String userName);

	@Query("SELECT p FROM User p WHERE p.userName = :username and p.password=:password and p.role = :eRole")
	User login(String username, String password, ERole eRole);
	
	
	
}
