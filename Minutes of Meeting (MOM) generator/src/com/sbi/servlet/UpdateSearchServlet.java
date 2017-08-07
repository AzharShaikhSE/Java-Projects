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
import com.sbi.pojo.EmployeeComments;
import com.sbi.service.UpdateService;


public class UpdateSearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       List<ActionItem> ld = new ArrayList<ActionItem>();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateSearchServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	ActionItem ai = new ActionItem();
		ai.setDescription(request.getParameter("action_item"));
		
		ai.setOrganizer(request.getParameter("assigned_by"));
		ai.setClosureDate(request.getParameter("closure_date"));
		//ai.setMeetingId(Integer.parseInt(request.getParameter("meeting_id")));
		String mid=request.getParameter("meeting_id");
		UpdateService us= new UpdateService();
		String button=request.getParameter("forward_b"); 
		String comments=request.getParameter("comments");
		if("Update".equals(button))
		{
			System.out.println("in update button");
			ai.setDescription(request.getParameter("action_name"));
			ai.setActionId(Integer.parseInt(request.getParameter("action_id")));
			int mi= Integer.parseInt(mid);
			ai.setMeetingId(mi);
			us.update(ai,comments);
			RequestDispatcher requestDispatcher= request.getRequestDispatcher("employee.jsp");
			requestDispatcher.forward(request, response);
			
		}
		else if("ReadyForClosure".equals(button))
		{
			ai.setDescription(request.getParameter("action_name"));
			ai.setActionId(Integer.parseInt(request.getParameter("action_id")));
			int mi= Integer.parseInt(mid);
			ai.setMeetingId(mi);
			us.readyForClosure(ai,comments);
			RequestDispatcher requestDispatcher= request.getRequestDispatcher("employee.jsp");
			requestDispatcher.forward(request, response);
			
		}
		
		
		else
		{
			
		ld=us.getDetailsList(ai);
		int i=1;
		System.out.println(ld);
	
		request.getSession().setAttribute("ListDetails", ld);
		RequestDispatcher requestDispatcher= request.getRequestDispatcher("details.jsp");
		requestDispatcher.forward(request, response);
		}
	}

}
