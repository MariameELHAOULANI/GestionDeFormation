package com.bankend.springboot.repository;

import org.springframework.data.repository.CrudRepository;

import com.bankend.springboot.model.User;

public interface UserRepository extends CrudRepository<User, Long> {
	
	User findUserByUserName(String username);
}
