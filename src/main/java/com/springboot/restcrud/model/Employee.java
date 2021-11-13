package com.springboot.restcrud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data 
//lambook auto compliter
@Entity  
@Table(name="Employee")
public class Employee { 
	@Id
	@GeneratedValue(strategy=  GenerationType.IDENTITY)
	private Long id;  
	@Column(name="firstname", nullable=false) 
	private String firstname; 
	@Column(name="lastname",  nullable=false) 
	private String lastname; 
	@Column(name="email", nullable=false) 
	private String email;
	public Employee(String firstname, String lastname, String email) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getId() {
		return id;
	}
}
