package com.sbi.servlet;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.sbi.pojo.AdminDeptReportsTotalMom;
import com.sbi.service.ViewDeptReportsService;


public class ViewDeptReportsServlets extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ViewDeptReportsServlets() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		AdminDeptReportsTotalMom deptwiseTotal= new AdminDeptReportsTotalMom();
		ViewDeptReportsService deptservice=new ViewDeptReportsService();
		String selectedDept= request.getParameter("selectDept");
		
		int seletedOption=Integer.parseInt(selectedDept);
		deptwiseTotal = deptservice.getDeptwiseTotalList(seletedOption);
		
		request.getSession().setAttribute("deptwisereport", deptwiseTotal);
		
		RequestDispatcher requestDispatcher1 = request
				.getRequestDispatcher("view_deptreports.jsp");
		requestDispatcher1.forward(request, response);
		
		
		
	}

	
	
	
}
