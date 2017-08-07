package com.sbi.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sbi.pojo.ActionItem;
import com.sbi.pojo.Attendance;
import com.sbi.pojo.Employee;
import com.sbi.pojo.EmployeeAction;
import com.sbi.pojo.EmployeeComments;
import com.sbi.service.ActionService;

public class ActionItemServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ActionItemServlet() {
		super();

	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		Employee emp = new Employee();
		Employee emp2 = new Employee();
		ActionItem ai = new ActionItem();
		Attendance attend = new Attendance();
		EmployeeAction empAction = new EmployeeAction();
		EmployeeComments empComment=new EmployeeComments();

		emp = (Employee) request.getSession(false).getAttribute("employee");
		String empId = emp.getEmployeeId();
		System.out.println(empId);

		String count = request.getParameter("count1");
		int cnt = Integer.parseInt(count);
		System.out.println(cnt);
		int attendance = 1;
		for (int i = 0; i < cnt; i++) {
			emp2.setEmployeeId(request.getParameter("empid" + i)); // participant

			String preabs = request.getParameter("attendance" + i);
			if (preabs == null) {
				attendance = 0;
			}
			attend.setAttendance(attendance);

			ai.setDescription(request.getParameter("description" + i));

			ai.setClosureDate(request.getParameter("closure" + i));

			ai.setOrganizer(empId);

			ai.setMeetingId((Integer) request.getSession(false).getAttribute(
					"meetingId"));

			attend.setMeetingId((Integer) request.getSession(false)
					.getAttribute("meetingId"));
			attend.setEmployeeId(request.getParameter("empid" + i));

			empAction.setMeetingId((Integer) request.getSession(false)
					.getAttribute("meetingId"));
			empAction.setEmployeeId(request.getParameter("empid" + i));
			
			empComment.setMeetingId((Integer) request.getSession(false).getAttribute(
					"meetingId"));
			
			empComment.setDescription(request.getParameter("description" + i));
			
			

			ActionService as = new ActionService();
			as.setObject(ai, attend, empAction, emp2,empComment);
			as.insertValues();

			RequestDispatcher requestDispatcher3 = request
					.getRequestDispatcher("DashBoardServlet");

			requestDispatcher3.forward(request, response);

		}

	}
}
/*
 * String employeeId = request.getParameter("empid"+i);
 * System.out.println("empid"+i); System.out.println(employeeId);
 */
/*
 * System.out.println(employeeId + "  " + preabs + "  " + action + " " +
 * closure);
 */

// ai.setDescription(request.getParameter("description"+i));

/*
 * int meetingId=(Integer) request.getSession(false).getAttribute("meetingId");
 * System.out.println(meetingId);
 */
