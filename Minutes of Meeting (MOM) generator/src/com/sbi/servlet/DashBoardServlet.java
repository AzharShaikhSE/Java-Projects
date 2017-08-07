package com.sbi.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sbi.pojo.ActionItem;
import com.sbi.pojo.DashBoard;
import com.sbi.pojo.Employee;
import com.sbi.service.DashBoardService;
import com.sbi.service.NotificationService;

public class DashBoardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public DashBoardServlet() {
		super();

	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		DashBoardService dashboard = new DashBoardService();
		dashboard.dashBoardService();
		
		DashBoard d = new DashBoard();
		d = dashboard.getObject();
		int role;
		role=dashboard.getRole();
		request.getSession().setAttribute("dashboard", d);
		System.out.println("Servlet");
		
		
		NotificationService notify=new NotificationService();
		List<ActionItem> list=new ArrayList<ActionItem>();
		
		Employee emp=new Employee();
		ActionItem ai = new ActionItem();
		
		emp=(Employee) request.getSession(false).getAttribute("employee");
		String empId=emp.getEmployeeId();
		System.out.println(empId);
		list=notify.getNotification(empId);
		
		request.getSession(false).setAttribute("notification",list );
		RequestDispatcher requestDispatcher3 = request
				.getRequestDispatcher("employee.jsp");
		requestDispatcher3.forward(request, response);

	}

}
