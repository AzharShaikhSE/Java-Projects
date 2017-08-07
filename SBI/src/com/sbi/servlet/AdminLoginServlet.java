package com.sbi.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sbi.pojo.Admin;

import com.sbi.service.AdminLoginService;



public class AdminLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String adminId= request.getParameter("userId");
		String password=request.getParameter("password");
		
		PrintWriter out=response.getWriter();
		
		
		Admin a=new Admin();
		a.setAdminId(adminId);
		a.setAdminpassword(password);
		
		
		
		AdminLoginService als=new AdminLoginService();
		als.getObject(a);
		
		if(!als.validate())
		{
			
					out.println("adminId Length is not 6/Password Length is less than 6");
				
		
				
			
			 RequestDispatcher requestDispatcher = request
             .getRequestDispatcher("home_page.jsp");
			 requestDispatcher.forward(request, response);

			
		}
		
		if(!als.authorityCheck())
		{
			RequestDispatcher requestDispatcher1 = request
            .getRequestDispatcher("InvalidLogin.jsp");
			 requestDispatcher1.forward(request, response);
		}
		else
			{out.println("Success");}
	}
}
		
	


