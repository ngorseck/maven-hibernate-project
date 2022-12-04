package com.groupeisi.security.dao;

import java.util.List;

import com.groupeisi.security.entities.AppRole;

public interface IAppRole {

	public int save (AppRole appRole);
	public int update (AppRole appRole);
	public int remove (int id);
	public AppRole get(int id);
	public List<AppRole> getAll();
	
}
