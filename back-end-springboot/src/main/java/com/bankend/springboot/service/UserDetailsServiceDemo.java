package com.bankend.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.bankend.springboot.model.User;
import com.bankend.springboot.repository.UserRepository;

@Service
public class UserDetailsServiceDemo implements UserDetailsService {
	
	@Autowired
	private UserRepository repo;

	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		User user = repo.findUserByUserName(username); 
		if(user == null)
			throw new UsernameNotFoundException("User Error 404");
		
		return new UserDetailsDemo(user);
	}

}
