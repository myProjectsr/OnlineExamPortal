package com.rkyash.dao;



import org.hibernate.Query;
import org.hibernate.Session;

import com.rkyash.bean.Admin;
import com.rkyash.util.HibernateUtil;

public class AdminDaoImpl implements AdminDao {

	@Override
	public boolean adminLogin(String adminUserName, String adminPassword) {
		
		Session session=HibernateUtil.getSession();
		if(session!=null)
		{
			try {
					//String query="SELECT a.adminUserName,a.adminPassword FROM Admin a";
					//Query<Admin> query2=session.createQuery(query);
					Admin admin=(Admin)session.get(Admin.class, adminUserName);
					if(adminPassword.equals(admin.getAdminPassword()))
					{
						System.out.println("Admin:"+admin.toString());
						return true;
					}
			}
			catch (Exception e) {
				System.out.println("Exception occred while reading user data:"+e.getMessage());
				return false;
			}
		}
		else 
		{
			System.out.println("Db Server is Down..");
		}
		return false;
	}

}
