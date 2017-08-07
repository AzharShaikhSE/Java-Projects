package com.sbi.servlet;

import java.io.IOException;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sbi.dao.DropdownList;

/**
 * Servlet implementation class Dropdown
 */
public class Dropdown   implements ServletContextListener{
	DropdownList dl=new DropdownList();
	List<String> ls=new ArrayList<String>();
	private static final long serialVersionUID = 1L;

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		/*ServletContext context=arg0.getServletContext();
		ResultSet rs=dl.getValues();
		while(rs.next())
		{
			String result=rs.getString(4);
			//System.out.println(result);
			ls.add(result);
			//System.out.println(ls.get(0));
			
		}
		
		context.setAttribute("dbObject",ls);
		RequestDispatcher requestDispatcher = context
        .getRequestDispatcher("sampledropdown.jsp");
		 requestDispatcher.forward(request, response);*/
	}
	
}


