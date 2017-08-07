package com.sbi.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sbi.pojo.ActionItem;
import com.sbi.service.UpdateActionService;

/**
 * Servlet implementation class UpdateActionStatusServlet
 */
public class UpdateActionStatusServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateActionStatusServlet() {
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
		UpdateActionService uas = new UpdateActionService();
		System.out.println("yo aala");
		String button=request.getParameter("forward_b");
		System.out.println(button+" is pressed");
		if("Widraw".equals(button))
		{
			ActionItem ai = new ActionItem();
			System.out.println("in widraw button");
			 ai.setActionId(Integer.parseInt(request.getParameter("action_id")));
			 uas.ActionStatusWidraw(ai);
			 RequestDispatcher requestDispatcher= request.getRequestDispatcher("employee.jsp");
				requestDispatcher.forward(request, response);
			 
			
		}
		else if("Closure".equals(button))
		{
			ActionItem ai = new ActionItem();
			System.out.println("in closure button");
			 ai.setActionId(Integer.parseInt(request.getParameter("action_id")));
			 uas.ActionStatusClosure(ai);
			 RequestDispatcher requestDispatcher= request.getRequestDispatcher("employee.jsp");
				requestDispatcher.forward(request, response);
			
		}
		else
		{
			ActionItem ai = new ActionItem();
			System.out.println("in redo button");
			 ai.setActionId(Integer.parseInt(request.getParameter("action_id")));
			 uas.ActionStatusRedo(ai);
			 RequestDispatcher requestDispatcher= request.getRequestDispatcher("employee.jsp");
				requestDispatcher.forward(request, response);
		}
	}

}
