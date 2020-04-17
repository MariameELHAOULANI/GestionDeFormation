package com.bankend.springboot.repository;

import org.springframework.data.repository.CrudRepository;

import com.bankend.springboot.model.FormationsBenificaire;


public interface FormationBenificaire extends CrudRepository<FormationsBenificaire, Long> {
	
}
