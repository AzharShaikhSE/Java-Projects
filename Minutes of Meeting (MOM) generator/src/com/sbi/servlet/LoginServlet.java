package com.sbi.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sbi.pojo.Employee;
import com.sbi.service.LoginService;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
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

		String username = request.getParameter("userId");
		String password = request.getParameter("password");
		// String radioAdmin=request.getParameter("radio");
		// System.out.println(radioAdmin);
			int role;
		/*if (request.getParameter("radio").equals("yes")) {
			RequestDispatcher requestDispatcher2 = request
					.getRequestDispatcher("AdminLoginServlet");
			requestDispatcher2.forward(request, response);
		}*/

			PrintWriter out = response.getWriter();

			Employee e = new Employee();
			e.setEmployeeId(username);
			e.setPassword(password);

			LoginService ls = new LoginService();
			ls.getObject(e);
			
			
			if (!ls.validate()) {

				out.println("Username Length is not 6/Password Length is less than 6");

				RequestDispatcher requestDispatcher = request
						.getRequestDispatcher("HomePage.jsp");
				requestDispatcher.forward(request, response);

			}

			if (!ls.authorityCheck()) {
				RequestDispatcher requestDispatcher1 = request
						.getRequestDispatcher("InvalidLogin.jsp");
				requestDispatcher1.forward(request, response);
			}
			role=ls.getRole();
			System.out.println("Servlet role"+role);
			e.setRole(role);
		
			
		
			
				HttpSession session = request.getSession();
				session.setAttribute("employee", e);
				//session.setMaxInactiveInterval(30 * 60);
			
			RequestDispatcher requestDispatcher3 = request
					.getRequestDispatcher("DashBoardServlet");
			requestDispatcher3.forward(request, response);
			
			
		}

	}


