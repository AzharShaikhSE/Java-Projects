package com.sbi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sbi.pojo.ActionItem;

public class NotificationDao {
	List<ActionItem> list = new ArrayList<ActionItem>();
	ActionItem ai = new ActionItem();
	Connection connection = null;
	PreparedStatement ptmt = null;
	ResultSet resultSet = null;
	int result = 0;

	private Connection getConnection() throws SQLException {
		Connection conn;
		conn = ConnectionFactory.getInstance().getConnection();
		return conn;
	}

	public List<ActionItem> getNotifications(String empId) {
		System.out.println("this is findemp");
		try {

			String queryString = "select a.Description,a.Status,m.Date,m.MeetingId,a.Organizer,a.ActionItemId from Minutes.Meeting m,Minutes.ActionItem a where m.MeetingId=a.MeetingId and a.Status=1 and a.AssignedToName=(select EmployeeName from HumanResources.Employee where EmployeeId='"+empId+"')  order by m.Date desc";
			System.out.println("this is query");
			connection = getConnection();
			ptmt = connection.prepareStatement(queryString);
			resultSet = ptmt.executeQuery();
			while (resultSet.next()) {
				ActionItem ai = new ActionItem();
				System.out.println("this is while");
	
				ai.setDescription(resultSet.getString(1));
				ai.setStatus(resultSet.getInt(2));
				ai.setClosureDate(resultSet.getString(3));
				ai.setMeetingId(resultSet.getInt(4));
				ai.setOrganizer(resultSet.getString(5));
				ai.setActionId(resultSet.getInt(6));
				list.add(ai);

			}
			return list;

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (resultSet != null)
					resultSet.close();
				if (ptmt != null)
					ptmt.close();
				if (connection != null)
					connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return list;

	}

}
