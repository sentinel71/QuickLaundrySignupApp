package com.quicklaundry.portal.model;

import java.io.Serializable;

import javax.persistence.*;


/**
 * The persistent class for the signup database table.
 * 
 */
@Entity
@Table(name = "signup")
public class Signup implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String id;

	private String email;

	public Signup() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}