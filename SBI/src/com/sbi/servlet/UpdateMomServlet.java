package com.sbi.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.sbi.pojo.Employee;
import com.sbi.pojo.Meeting;
import com.sbi.service.UpdateMomService;


/**
 * Servlet implementation class UpdateMomServlet
 */
public class UpdateMomServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateMomServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("in update MoM Servlet");
		Meeting m=new Meeting();
		Employee emp=(Employee) request.getSession(false).getAttribute("employee");
		emp.getEmployeeId();
		m.setOrganizer(emp.getEmployeeId());
		
		UpdateMomService ums=new UpdateMomService();

	
		List<Meeting> ml=new ArrayList<Meeting>();
		
			try {
				ml.clear();
				ml=ums.getMeetingList(m);
				System.out.println("Update Mom Servlet"+ml);
				request.getSession().setAttribute("MeetingList", ml);
				
				RequestDispatcher requestDispatcher= request.getRequestDispatcher("created_mom.jsp");
				requestDispatcher.forward(request, response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
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
