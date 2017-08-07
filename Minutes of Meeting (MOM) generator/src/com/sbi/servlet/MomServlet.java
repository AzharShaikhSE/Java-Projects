package com.sbi.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.sql.SQLException;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;





import com.sbi.pojo.Employee;
import com.sbi.pojo.Meeting;
import com.sbi.service.MomService;

public class MomServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MomServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println("in mom servlet");
		Employee emp=new Employee();
		emp=(Employee) request.getSession(false).getAttribute("employee");
		/*String organizerId=emp.getEmployeeId();*/
//			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-mm-dd");
	/*	
		String subject = request.getParameter("subject");
		String purpose = request.getParameter("purpose");
		String date = request.getParameter("date");
		
		PrintWriter out = response.getWriter();*/
		/*
		 * HttpSession s=request.getSession(); s.setAttribute(e,emp)
		 */
		/*try {
			
			date =   formatter.parse(d);
		} catch (java.text.ParseException e) {  
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		java.sql.Date date3 = new java.sql.Date(date.getTime());
		System.out.println("this is date"+date3);
		long i=date3.getTime();
		System.out.println("this is time" +i);
		
		
		
		
		
		
		/*
		try {
			String time = request.getParameter("stime");
			SimpleDateFormat formatter1 = new SimpleDateFormat("HH:mm");
			startTime = (Time) formatter1.parse(time);
			// System.out.println(" meeting time " + startTime);
		} catch (java.text.ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			String etime = request.getParameter("etime");
			SimpleDateFormat formatter1 = new SimpleDateFormat("HH:mm");
			endTime = (Time) formatter1.parse(etime);
		} catch (java.text.ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		/*String stime=request.getParameter("stime");

		String etime=request.getParameter("etime");
		String pdiscussed = request.getParameter("points_discussed");
		String dtaken = request.getParameter("decisions");
		String actionItems = request.getParameter("actions");
		String noOfEmployees = request.getParameter("participants");
		System.out.println(subject);

		System.out.println(purpose);
		System.out.println(date);
		System.out.println(stime);
		System.out.println(pdiscussed);
		System.out.println(dtaken);
		System.out.println(actionItems);*/
	/*	System.out.println(noOfEmployees);*/

		Meeting m = new Meeting();
		
		m.setSubject(request.getParameter("subject"));
		m.setPurpose(request.getParameter("purpose"));
		m.setDate(request.getParameter("date"));
		m.setStartTime( request.getParameter("stime"));
		m.setDecisionTaken(request.getParameter("decisions"));
	
		m.setEndTime(request.getParameter("etime"));
		m.setOrganizer(emp.getEmployeeId());
	
		MomService ms = new MomService();
		ms.setObject(m);
		try {
			ms.insert();
			int meetingId=m.getMeetingId();
			
			request.getSession(false).setAttribute("meetingId", meetingId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	/*	if (!ms.validate()) {

			out.println("End time Incorrect");

			RequestDispatcher requestDispatcher = request
					.getRequestDispatcher("MinutesOfMeeting.jsp");
			requestDispatcher.forward(request, response);

		}*/
		

	/*	try {
			if(!ms.insert())
			{
				
					RequestDispatcher requestDispatcher1 = request
							.getRequestDispatcher("InvalidLogin.jsp");
					requestDispatcher1.forward(request, response);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		/*out.print("insert Successfull");*/
		RequestDispatcher requestDispatcher = request
        .getRequestDispatcher("DropdownServlet");
		
		 requestDispatcher.forward(request, response);

	}

}
