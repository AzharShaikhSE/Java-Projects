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
import com.sbi.service.UpdateService;



public class UpdateServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("in update Servlet");
		ActionItem action=new ActionItem();
/*		action.setAssignedToName("xyz");*/
		Employee emp=(Employee) request.getSession(false).getAttribute("employee");
		String empId=emp.getEmployeeId();
		
		UpdateService us=new UpdateService();
		
	
		List<ActionItem> la=new ArrayList<ActionItem>();
		
			try {
				la.clear();
				la=us.getItemList(action,empId);
				System.out.println("Update Servlet"+la);
				request.getSession().setAttribute("actionList", la);
				
				RequestDispatcher requestDispatcher= request.getRequestDispatcher("update.jsp");
				requestDispatcher.forward(request, response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			

    }



		
		
		
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
