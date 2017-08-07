package com.sbi.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sbi.pojo.Employee;
import com.sbi.service.DropdownService;


public class EmployeeDropdownServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public EmployeeDropdownServlet() {
        super();
      
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {

			DropdownService ds=new DropdownService();  
			List<Employee> ls=new ArrayList<Employee>();
			ls=ds.getList();
			
			
			request.getSession().setAttribute("EList", ls);
			
			
			RequestDispatcher requestDispatcher = request
	        .getRequestDispatcher("view_employeewise_reports.jsp");
			
			 requestDispatcher.forward(request, response);
			
			}		 catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
