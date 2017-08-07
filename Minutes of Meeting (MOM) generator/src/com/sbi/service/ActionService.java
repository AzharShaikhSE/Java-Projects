package com.sbi.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.sbi.dao.ActionDao;
import com.sbi.dao.AdminDao;
import com.sbi.dao.ConnectionFactory;
import com.sbi.pojo.ActionItem;
import com.sbi.pojo.Admin;
import com.sbi.pojo.Attendance;
import com.sbi.pojo.Employee;
import com.sbi.pojo.EmployeeAction;
import com.sbi.pojo.EmployeeComments;
import com.sbi.pojo.StatusConstants;
import com.sun.org.apache.bcel.internal.generic.NEW;

public class ActionService {
	Connection connection = null;
	PreparedStatement ptmt = null;
	ResultSet resultSet = null;
	int result = 0;

	private Connection getConnection() throws SQLException {
		Connection conn;
		conn = ConnectionFactory.getInstance().getConnection();
		return conn;
	}

	ActionDao aid = new ActionDao();
	ActionItem ai = new ActionItem();
	Attendance attend = new Attendance();
	EmployeeAction empAction = new EmployeeAction();
	StatusConstants sc = new StatusConstants();
	Employee employee2 = new Employee();
	EmployeeComments employeeComment=new EmployeeComments();
	int status;
	String participant;

	public ActionService() {

	}

	public void setObject(ActionItem ai, Attendance attend,
			EmployeeAction empAction, Employee employee2,EmployeeComments employeeComment) {
		this.ai = ai;
		this.attend = attend;
		this.employee2 = employee2;
		this.empAction = empAction;
		this.employeeComment=employeeComment;

		participant = employee2.getEmployeeId();
		System.out.println("service" + participant);

		if (participant != "") {
			status = sc.minute_assigned;
		}
		ai.setStatus(status);
		employeeComment.getStatus();
	}

	public ActionService(String ename) {
		super();

	}

	public void getEmpName() {
		String empName = aid.findEmp(participant);
		System.out.println("this is" + empName);
		ai.setAssignedToName(empName);
	}

	public void getActionId() {
		int actionId = aid.findActionId();
		System.out.println(actionId);
		ai.setActionId(actionId);
		empAction.setActionId(actionId);
		employeeComment.setActionItemId(actionId);
	}

	public void insertValues() {
		getEmpName();
		try {
			connection = getConnection();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		try {
			connection.setAutoCommit(false);
			aid.insertAction(ai);
			if (participant != null) {
				aid.insertAttendance(attend);
			}
			getActionId();
			connection.commit();
			if (participant != null) {
				aid.insertEmployeeAction(empAction);
			}
			aid.insertActionTimeStamp(employeeComment);
		} catch (SQLException e) {
			try {
				connection.rollback();
			} catch (SQLException e1) {

				e1.printStackTrace();
			}
			e.printStackTrace();
		}

	}

}
