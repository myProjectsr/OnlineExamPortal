package com.rkyash.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.hql.internal.ast.tree.BooleanLiteralNode;

import com.rkyash.service.AdminService;
import com.rkyash.service.AdminServiceImpl;

@WebServlet("/adminLogin")
public class AdminLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public AdminLoginController() {
        super();
    }

    String page="index.jsp";
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.sendRedirect(page);
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String adminuser=request.getParameter("username");
		String adminpassword=request.getParameter("password");
		
		if(adminuser.trim().length()>=0 && adminuser !=null && adminpassword.trim().length()>=0 && adminpassword!=null)
		{
			AdminService adminService=new AdminServiceImpl();
			
			boolean flag=adminService.adminLogin(adminuser, adminpassword);
			
			if(flag)
			{
				System.out.println("Login Successfully....");
				request.setAttribute("username", adminuser);
				request.setAttribute("msg", "Login Sucess....");
				page="pages/admin/home.jsp";
			}
			else
			{
				request.setAttribute("msg1", "Worng useername and password, Please tyr agian!!");
			}
		}
		else
		{
			request.setAttribute("msg1", "Please enter useername and password");
		}
		request.getRequestDispatcher(page).include(request, response);
	}

}
