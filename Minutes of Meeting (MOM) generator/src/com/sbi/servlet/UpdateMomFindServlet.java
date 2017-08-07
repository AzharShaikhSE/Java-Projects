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
import com.sbi.pojo.Meeting;
import com.sbi.service.UpdateMomService;

/**
 * Servlet implementation class UpdateMomFindServlet
 */
public class UpdateMomFindServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateMomFindServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
				Meeting m2=new Meeting();
				ActionItem ai = new ActionItem();
				UpdateMomService ums=new UpdateMomService();
				System.out.println("in search");
				
				String str=request.getParameter("meetings");
				String[] string = str.split(":");
				System.out.println(string[0]);
				
				String button=request.getParameter("forward_b");
				if("ViewAssignedDetails".equals(button))
				{

					
					ai.setMeetingId(Integer.parseInt(request.getParameter("meeting_id")));
					System.out.println("in button pressed");
					List<ActionItem> ad=new ArrayList<ActionItem>();
					ad.clear();
					ad=ums.getActionDetails(ai);
					System.out.println("LIst of action details"+ad);
					request.getSession().setAttribute("ActionDetails", ad);
					
					RequestDispatcher requestDispatcher= request.getRequestDispatcher("created_action.jsp");
					requestDispatcher.forward(request, response);
				}
				else{
					
				List<Meeting> md=new ArrayList<Meeting>();
				m2.setMeetingId(Integer.parseInt(string[1]));
				m2.setSubject(string[0]);
				
				try {
					md.clear();
					md=ums.getMeetingDetails(m2);
					System.out.println("Update Search mom Servlet"+md);
					request.getSession().setAttribute("MeetingDetails", md);
					
					RequestDispatcher requestDispatcher= request.getRequestDispatcher("created_mom.jsp");
					requestDispatcher.forward(request, response);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				}
				
		}
				/*	m.setMeetingId(Integer.parseInt(request.getParameter("actionId")));;
				
	
	
				UpdateService updateStatus=new UpdateService();
				updateStatus.serviceupdate(momActionStatusPojo);
		
				RequestDispatcher rd=request.getRequestDispatcher("EmployeeDashboard.jsp");
				rd.forward(request, response);
				return;
		
		}
	
	else
	{
		MoMActionStatus momActionStatusPojo=new MoMActionStatus();


		momActionStatusPojo.setMomId(Integer.parseInt(request.getParameter("momId")));

		momActionStatusPojo.setActionId(Integer.parseInt(request.getParameter("actionId")));;
		momActionStatusPojo.setComments(request.getParameter("comments"));
		momActionStatusPojo.setStatus("Ready For Closure");


		UpdateService updateStatus=new UpdateService();
		updateStatus.serviceupdate(momActionStatusPojo);

		RequestDispatcher rd=request.getRequestDispatcher("EmployeeDashboard.jsp");
		rd.forward(request, response);
		return;
		
	}*/
	}
	


