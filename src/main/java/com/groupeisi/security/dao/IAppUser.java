package com.groupeisi.security.dao;

import com.groupeisi.security.entities.AppUser;

public interface IAppUser {

	public int save (AppUser appUser);
	public AppUser get(int id);
	public AppUser login(String email, String password);
}
