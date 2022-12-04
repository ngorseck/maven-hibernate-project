package com.groupeisi.security.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table (name = "appuser")
public class AppUser implements Serializable  {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;
	@Column (name = "firsname", nullable = false, length = 200)
	private String firsName;
	@Column (name = "lastname", nullable = false, length = 150)
	private String lastName;
	@Column (name = "email", nullable = false, length = 200, unique = true)
	private String email;
	@Column (name = "password", nullable = false, length = 200)
	private String password;
	@ManyToMany(fetch = FetchType.EAGER)
	List<AppRole> roles = new ArrayList<AppRole>();
	
	public AppUser() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirsName() {
		return firsName;
	}

	public void setFirsName(String firsName) {
		this.firsName = firsName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<AppRole> getRoles() {
		return roles;
	}

	public void setRoles(List<AppRole> roles) {
		this.roles = roles;
	}
	
	
	
	
}
