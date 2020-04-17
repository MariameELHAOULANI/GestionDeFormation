package com.bankend.springboot.model;

import java.util.Date;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "benificiare")
public class Benificiare {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
	
	private String fullName; 
	private String Address; 
	private Date DateOfBirth;
	private String Nationality;
	private int telephone; 
	private String email;

	
  
	public String getfullName() {
		return fullName;
	}
	public void fullName(String fullName) {
		this.fullName = fullName;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String Address) {
		this.Address = Address;
	}
	public Date getDateOfBirth() {
		return DateOfBirth;
	}
	public void DateOfBirth(Date DateOfBirth) {
		this.DateOfBirth = DateOfBirth;
	}
	public String getNationality() {
		return Nationality;
	}
	public void setNationality(String Nationality) {
		this.Nationality= Nationality;
	}
	public int getTelephone() {
		return telephone;
	}
	public void setTelephone(int telephone) {
		this.telephone= telephone;
	}
	

	
}