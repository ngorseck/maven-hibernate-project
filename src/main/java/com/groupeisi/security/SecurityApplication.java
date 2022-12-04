package com.groupeisi.security;

import java.util.ArrayList;
import java.util.List;

import com.groupeisi.security.dao.AppRoleImpl;
import com.groupeisi.security.dao.AppUserImpl;
import com.groupeisi.security.dao.IAppRole;
import com.groupeisi.security.dao.IAppUser;
import com.groupeisi.security.entities.AppRole;
import com.groupeisi.security.entities.AppUser;

public class SecurityApplication {

	public static void main(String[] args) {
		
		IAppRole roledao = new AppRoleImpl();
		
		AppRole role = new AppRole();
		role.setName("ROLE_USER");
		
		//int result = roledao.save(role);
		//System.out.println(result);
		//roledao.getAll()
			//.forEach(r -> System.out.println(r.getName()));
		AppUser appUser = new AppUser();
		appUser.setFirsName("Asse");
		appUser.setLastName("Faye");
		appUser.setEmail("afaye@isi.sn");
		appUser.setPassword("passer!@#$314");
		List<AppRole> roles = new ArrayList<AppRole>();
		roles.add(roledao.get(1));//base de donnees
		roles.add(roledao.get(2));
		appUser.setRoles(roles);
		
		IAppUser userdao = new AppUserImpl();
		int result = userdao.save(appUser);
		System.out.println(result);
		
	}

}
