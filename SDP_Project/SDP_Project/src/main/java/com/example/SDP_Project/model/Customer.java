package com.example.SDP_Project.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "customer_table")
public class Customer {
	
	 @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name = "customer_id")
	  private Long id;
	 @Column(name = "customer_username")
	  private String username;
	 @Column(name = "customer_email")
	  private String email;
	 @Column(name = "customer_password")
	  private String password;
	public Long getId() {
		return id;
	}
	public String getUsername() {
		return username;
	}
	public String getEmail() {
		return email;
	}
	public String getPassword() {
		return password;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	 
	 

}
