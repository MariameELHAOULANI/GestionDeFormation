package com.bankend.springboot.repository;

import org.springframework.data.repository.CrudRepository;

import com.bankend.springboot.model.PlanFormation;

public interface PlanFormationRepository extends CrudRepository<PlanFormation, Long> {
	
}