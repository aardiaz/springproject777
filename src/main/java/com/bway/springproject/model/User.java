package com.bway.springproject.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "user_tbl")
public class User {
	@Id  //pK
	@GeneratedValue(strategy = GenerationType.IDENTITY) //AI
	private int id;
	private String fname;
	private String lname;
	@Column(unique = true)
	private String username;
	private String password;
}
