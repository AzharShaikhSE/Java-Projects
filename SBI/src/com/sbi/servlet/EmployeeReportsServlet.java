package com.sbi.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sbi.pojo.EmployeewiseMomsCreated;
import com.sbi.service.EmployeewiseReportService;

public class EmployeeReportsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public EmployeeReportsServlet() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		EmployeewiseMomsCreated empDetailsReport= new EmployeewiseMomsCreated();
		EmployeewiseReportService empservice=new EmployeewiseReportService();
		String selectedEmp= request.getParameter("selectemp");
		
		empDetailsReport = empservice.getDeptwiseTotalList(selectedEmp);
		
		request.getSession().setAttribute("empwiseReport", empDetailsReport);
		
		RequestDispatcher requestDispatcher1 = request
				.getRequestDispatcher("view_employeewise_reports.jsp");
		requestDispatcher1.forward(request, response);
		
	}

}
