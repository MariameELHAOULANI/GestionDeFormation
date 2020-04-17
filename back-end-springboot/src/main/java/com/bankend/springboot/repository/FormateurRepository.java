package com.bankend.springboot.repository;

import org.springframework.data.repository.CrudRepository;
import com.bankend.springboot.model.Formateur;
public interface FormateurRepository extends CrudRepository<Formateur, Long> {
	
}
