package com.sbi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sbi.pojo.ActionItem;
import com.sbi.pojo.StatusConstants;

public class UpdateDao {

	Connection connection = null;
	PreparedStatement ptmt = null;
	ResultSet resultSet = null;
	int result;
	StatusConstants sc = new StatusConstants();

	public List<ActionItem> la = new ArrayList<ActionItem>();
	public List<ActionItem> lb = new ArrayList<ActionItem>();
	public List<String> cl = new ArrayList<String>();

	private Connection getConnection() throws SQLException {
		Connection conn;
		conn = ConnectionFactory.getInstance().getConnection();
		return conn;
	}

	public void retrieveAction(ActionItem action,String empId) {
		try {
			connection = getConnection();
			ptmt = connection.prepareStatement("select * from Minutes.ActionItem  where AssignedToName=(select EmployeeName from HumanResources.Employee where EmployeeId=?)");
			ptmt.setString(1, empId);
			resultSet = ptmt.executeQuery();
			la.clear();
			while (resultSet.next()) {
				ActionItem ac = new ActionItem();
				ac.setDescription(resultSet.getString(1));
				la.add(ac);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void retrieveDetails(ActionItem ai) {
		try {

			connection = getConnection();
			ptmt = connection
					.prepareStatement("select ActionItemId,Description,Organizer,Status,ClosureDate,MeetingId from Minutes.ActionItem  where Description like ?");
			ptmt.setString(1, ai.getDescription());
			resultSet = ptmt.executeQuery();
			lb.clear();
			while (resultSet.next()) {
				ai.setActionId(resultSet.getInt("ActionItemId"));
				ai.setDescription(resultSet.getString("Description"));
				ai.setOrganizer(resultSet.getString("Organizer"));
				ai.setStatus(resultSet.getInt("Status"));
		/*		int s = resultSet.getInt("Status");
				if (s == sc.minute_open) {
					ai.setStatus("Open");
				} else if (s == sc.minute_assigned) {
					ai.setStatus("Assigned");
				} else if (s == sc.minute_workInProgress) {
					ai.setStatus("WIP");
				} else if (s == sc.minute_readyToClosure) {
					ai.setStatus("Ready for Closure");
				} else if (s == sc.minute_widraw) {
					ai.setStatus("Widraw");
				} else {
					ai.setStatus("Closure");
				}*/

				ai.setClosureDate(resultSet.getString("ClosureDate"));
				ai.setMeetingId(resultSet.getInt("MeetingId"));

				lb.add(ai);
			}
			System.out.println(lb);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void insertCommentsUpdate(ActionItem a, String comments) {

		try {

			System.out.println("in insert of update");
			System.out.println(a.getActionId()+" this is action id");
			connection = getConnection();
			connection.setAutoCommit(false);
			ptmt = connection.prepareStatement("insert into Minutes.EmployeeComments values(?,?,?,?,?,?)");
			
			ptmt.setInt(1, a.getActionId());
			ptmt.setInt(2, a.getMeetingId());
			ptmt.setString(3, a.getDescription());
			java.sql.Timestamp sqlDate = new java.sql.Timestamp(
			new java.util.Date().getTime());
			ptmt.setTimestamp(4, sqlDate);
			ptmt.setString(5, comments);
			ptmt.setInt(6, 2);
			
			result = ptmt.executeUpdate();

			ptmt = connection.prepareStatement("update Minutes.ActionItem set Status=2 where Description like ? and ActionItemId=?");
			ptmt.setString(1, a.getDescription());
			ptmt.setInt(2,a.getActionId());
			result = ptmt.executeUpdate();
			connection.commit();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void insertCommentsRC(ActionItem ai, String comments) {
		// TODO Auto-generated method stub
		try {

			connection = getConnection();
			connection.setAutoCommit(false);
			ptmt = connection
					.prepareStatement("insert into Minutes.EmployeeComments values(?,?,?,?,?,?)");
			ptmt.setInt(1, ai.getActionId());
			ptmt.setInt(2, ai.getMeetingId());
			ptmt.setString(3, ai.getDescription());
			java.sql.Timestamp sqlDate = new java.sql.Timestamp(
			new java.util.Date().getTime());
			ptmt.setTimestamp(4, sqlDate);
			ptmt.setString(5, comments);
			ptmt.setInt(6, 3);
			
			result = ptmt.executeUpdate();
			result = ptmt.executeUpdate();

			ptmt = connection.prepareStatement("update Minutes.ActionItem set Status=3 where Description like ? and ActionItemId=?");
			ptmt.setString(1, ai.getDescription());
			ptmt.setInt(2, ai.getActionId());
			result = ptmt.executeUpdate();
			connection.commit();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
