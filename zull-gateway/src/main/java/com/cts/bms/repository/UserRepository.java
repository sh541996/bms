package com.cts.bms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.bms.model.UserDao;

public interface UserRepository extends JpaRepository<UserDao, Integer> {
	
    UserDao findByUsername(String username);
}
