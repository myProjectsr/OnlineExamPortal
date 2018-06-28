package com.rkyash.util;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	/*static SessionFactory sessionFactory;

	public static SessionFactory getHibenateCn()
	{
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		sessionFactory=cfg.buildSessionFactory();
		System.out.println("Bulid Session factory-------");
		return sessionFactory;
	}
*/
	
	private static Configuration configuration;
	 private static SessionFactory sessionFactory;

	 static {
	  configuration = new Configuration()
	    .configure("hibernate.cfg.xml");
	  sessionFactory = configuration.buildSessionFactory();
	 }

	 public static Session getSession() {
	  Session session = null;
	  if (sessionFactory != null) {
	   session = sessionFactory.openSession();
	  }
	  return session;
	 }
}
