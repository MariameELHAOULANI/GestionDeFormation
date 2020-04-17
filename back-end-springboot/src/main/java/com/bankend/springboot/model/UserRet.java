package com.bankend.springboot.model;

public class UserRet {
	
	public String firstName;
	public String lastName;
	public Boolean isFormateur;
	
	public UserRet(String firstName, String lastName, Boolean isFormateur) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.isFormateur = isFormateur;
	}
	
}
