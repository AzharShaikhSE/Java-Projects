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

import com.sbi.pojo.ActionItem;
import com.sbi.pojo.Employee;
import com.sbi.pojo.Meeting;
import com.sbi.pojo.StatusConstants;
import com.sbi.service.ViewMomService;

public class ViewMomServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ViewMomServlet() {
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
		String checkInput = request.getParameter("radio");
		// String checkStatus= request.getParameter("status_select");
		Employee emp=new Employee();
		emp=(Employee) request.getSession(false).getAttribute("employee");
		String empId=emp.getEmployeeId();
		System.out.println(empId);
		List<ActionItem> lst = new ArrayList<ActionItem>();
		List<Meeting> lm = new ArrayList<Meeting>();
		StatusConstants sc = new StatusConstants();
		
		if ("mid".equals(checkInput)) {
			System.out.println("MId");
			String mid = request.getParameter("meetingsearch");
			int msearch = Integer.parseInt(mid);
			Meeting m = new Meeting();
			m.setMeetingId(msearch);
			ViewMomService vs = new ViewMomService();
			vs.getMeetingObject(m,empId);

			try {
				lm = vs.getMeetingList();
				request.getSession().setAttribute("midList", lm);
				RequestDispatcher requestDispatcher = request
						.getRequestDispatcher("view_mom.jsp");
				requestDispatcher.forward(request, response);

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		else if ("date".equals(checkInput)) {
			System.out.println("Date");

			String dateSearch = request.getParameter("datesearch");

			Meeting m = new Meeting();

			m.setDate(dateSearch);
			ViewMomService vs1 = new ViewMomService();
			vs1.getDateObject(m,empId);
			List<Meeting> lm2 = new ArrayList<Meeting>();
			try {
				lm2 = vs1.getDateList();
				request.getSession().setAttribute("dateList", lm2);
				RequestDispatcher requestDispatcher = request
						.getRequestDispatcher("view_mom.jsp");
				requestDispatcher.forward(request, response);

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
			else {

			System.out.println("in view status");

			String sSearch = request.getParameter("status_select");
			ActionItem ai = new ActionItem();

			if (sSearch.equalsIgnoreCase("Open")) {
				System.out.println("in Open Status");
				ai.setStatus(sc.minute_open);
			} else if (sSearch.equalsIgnoreCase("Assigned")) {
				ai.setStatus(sc.minute_assigned);
			} else if (sSearch.equalsIgnoreCase("Work in Progress")) {
				ai.setStatus(sc.minute_workInProgress);
			} else if (sSearch.equalsIgnoreCase("Ready for Closure")) {
				ai.setStatus(sc.minute_readyToClosure);
			} else if (sSearch.equalsIgnoreCase("Closed")) {
				ai.setStatus(sc.minute_closure);
			}

			ViewMomService vs1 = new ViewMomService();
			vs1.getStatusObject(ai,empId);

			try {
				lst = vs1.getStatusList();
				request.getSession().setAttribute("statusList", lst);
				RequestDispatcher requestDispatcher = request
						.getRequestDispatcher("view_status.jsp");
				requestDispatcher.forward(request, response);

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

}
