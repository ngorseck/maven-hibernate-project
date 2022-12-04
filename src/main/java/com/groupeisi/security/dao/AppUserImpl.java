package com.groupeisi.security.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.groupeisi.security.config.HibernateUtil;
import com.groupeisi.security.entities.AppUser;

public class AppUserImpl implements IAppUser {

	private Session session;
	private Transaction transaction;
	
	public AppUserImpl () {
		session = HibernateUtil.getSessionFactory().openSession();
	}
	public int save(AppUser appUser) {
		try {
			transaction = session.beginTransaction();
			session.save(appUser);
			transaction.commit();
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	public AppUser get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public AppUser login(String email, String password) {
		// TODO Auto-generated method stub
		return null;
	}

}
