package com.sbi.servlet;

import java.io.IOException;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sbi.dao.DropdownList;
import com.sbi.pojo.Employee;
import com.sbi.service.DropdownService;

public class DropdownServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ServletConfig config;
	DropdownList dl=new DropdownList();
	/*List list=new ArrayList();*/
	
	
	public DropdownServlet() {
		super();
		
		
	}
	  public void init(ServletConfig config)  throws ServletException
	  { 
		  this.config=config; 
	  }
	  
	
	public void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		
	}

	
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		try {

			DropdownService ds=new DropdownService();  
			List<Employee> ls=new ArrayList<Employee>();
			ls=ds.getList();
			
			//ServletContext session=getServletContext();
			request.getSession().setAttribute("EList", ls);
			// request.setAttribute("EList",ls);
			// TODO : session.setAttribute("EList", ls);
			
			RequestDispatcher requestDispatcher = request
	        .getRequestDispatcher("assign_action.jsp");
			
			 requestDispatcher.forward(request, response);
			
			}		 catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
