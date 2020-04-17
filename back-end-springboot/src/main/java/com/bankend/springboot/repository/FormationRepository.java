package com.bankend.springboot.repository;

import org.springframework.data.repository.CrudRepository;


import com.bankend.springboot.model.Formation;



public interface FormationRepository extends CrudRepository<Formation, Long> {
	
}

