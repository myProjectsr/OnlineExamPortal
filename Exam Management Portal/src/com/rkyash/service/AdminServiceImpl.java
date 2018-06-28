package com.rkyash.service;

import com.rkyash.dao.AdminDao;
import com.rkyash.dao.AdminDaoImpl;

public class AdminServiceImpl implements AdminService {

	
	private AdminDao adminDao=new AdminDaoImpl();
	
	@Override
	public boolean adminLogin(String adminUserName, String adminPassword) {
		
		return adminDao.adminLogin(adminUserName, adminPassword);
	}

}
