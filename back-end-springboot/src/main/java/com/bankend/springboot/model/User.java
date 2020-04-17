package com.bankend.springboot.model;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.lang.NonNull;

@Entity
@Table(name = "users")
public class User {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO,generator="native")
	@GenericGenerator(name = "native",strategy = "native")
	@Column(name="id")
    private int id;
	
	@NonNull
	@Column(name="user_name")
	private String userName; 
	
	@NonNull
	@Email(message = "Email should be valid")
	@Column(name="email")
	private String email; 
	
	@NonNull
	@Column(name="first_name")
	private String firstName;
	
	@NonNull
	@Column(name="last_name")
	private String lastName;
	
	@NonNull
	@Column(name="password")
	private String password; 
	
	@NonNull
	@Column(name="is_formateur")
	private Boolean isFormateur;
	
	public User() {
		
	}
	
	public User(int id, String userName, @Email(message = "Email should be valid") String email, String firstName,
			String lastName, String password, Boolean isFormateur, Date dateCreated) {
		super();
		this.id = id;
		this.userName = userName;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.isFormateur = isFormateur;
		this.dateCreated = dateCreated;
	}

	@Basic(optional = false)
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_created", insertable = false, updatable = false)
	private Date dateCreated;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getIsFormateur() {
		return isFormateur;
	}

	public void setIsFormateur(Boolean isFormateur) {
		this.isFormateur = isFormateur;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public String toString() {
		return this.id + "/" + this.email + "/" + this.firstName + "/" + this.lastName + "/" + this.userName + "/" + this.password + "/" + this.isFormateur;
	}
	
}
