package com.rkyash.helpResourse;

import javax.imageio.spi.ServiceRegistry;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateCnfg {
	
	static SessionFactory sessionFactory;
	
	
	public static SessionFactory getHibenateCnfg()
	{
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		sessionFactory=cfg.buildSessionFactory();
		System.out.println("Bulid Session factory-------");
		return sessionFactory;
	}

}
