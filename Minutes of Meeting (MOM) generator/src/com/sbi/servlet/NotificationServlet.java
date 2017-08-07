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
import com.sbi.pojo.Attendance;
import com.sbi.pojo.Employee;
import com.sbi.service.NotificationService;

/**
 * Servlet implementation class NotificationServlet
 */
public class NotificationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NotificationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
		.getRequestDispatcher("notification.jsp");
		requestDispatcher3.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
