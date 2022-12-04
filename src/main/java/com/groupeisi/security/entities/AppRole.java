package com.groupeisi.security.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table (name = "approle")
public class AppRole implements Serializable {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;
	@Column (name = "name", nullable = false, length = 200, unique = true)
	private String name;
	@ManyToMany(mappedBy = "roles")
	List<AppUser> users = new ArrayList<AppUser>();
	
	public AppRole() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<AppUser> getUsers() {
		return users;
	}

	public void setUsers(List<AppUser> users) {
		this.users = users;
	}
	
	
}
