package com.rkyash.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.rkyash.util.HibernateUtil;





@WebServlet("/demo")
public class Demo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public Demo() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		//SessionFactory sessionFactory=HibernateCnfg.getHibenateCnfg();
		//SessionFactory sessionFactory;
		Session session;
		session= HibernateUtil.getSession();
		
		out.println("Table Create , Done");
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
