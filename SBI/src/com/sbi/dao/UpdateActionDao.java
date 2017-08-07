package com.sbi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.sbi.pojo.ActionItem;


public class UpdateActionDao {

	Connection connection = null;
	PreparedStatement preparedStatement=null;
	ResultSet resultSet = null;
	Statement statement=null;
	

	private Connection getConnection() throws SQLException {
		Connection conn;
		conn = ConnectionFactory.getInstance().getConnection();
		return conn;
	}
	
	public void widrawStatusUpdate(ActionItem ai) {
		try {
			
			connection = getConnection();
			connection.setAutoCommit(false);
			
			preparedStatement=connection.prepareStatement("select Description,MeetingId from Minutes.ActionItem where ActionItemId=? ");
			preparedStatement.setInt(1,ai.getActionId());
			resultSet=preparedStatement.executeQuery();			
			while(resultSet.next())
			{
			System.out.println("in rs");
			ai.setDescription(resultSet.getString("Description"));
			ai.setMeetingId(resultSet.getInt("MeetingId"));
		
			}
			System.out.println(ai);
			
			
			preparedStatement=connection.prepareStatement("insert into Minutes.EmployeeComments(ActionId,MeetingId,Description,TimeStamp,Status)  values(?,?,?,?,?)");
			
			preparedStatement.setInt(1,ai.getActionId());
			preparedStatement.setInt(2,ai.getMeetingId());
			preparedStatement.setString(3,ai.getDescription());
			java.sql.Timestamp  sqlDate = new java.sql.Timestamp(new java.util.Date().getTime());
			preparedStatement.setTimestamp(4, sqlDate);		
			preparedStatement.setInt(5,5);
			
			
			preparedStatement.execute();
			
			
			
			preparedStatement=connection.prepareStatement("update Minutes.ActionItem set Status=? where ActionItemId=?");
			preparedStatement.setInt(1,5);
			preparedStatement.setInt(2,ai.getActionId());
		
		
			preparedStatement.executeUpdate();
			connection.commit();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}

	public void closureStatusUpdate(ActionItem ai) {
		try{
		connection = getConnection();
		connection.setAutoCommit(false);
		
		preparedStatement=connection.prepareStatement("select Description,MeetingId from Minutes.ActionItem where ActionItemId=? ");
		preparedStatement.setInt(1,ai.getActionId());
		resultSet=preparedStatement.executeQuery();			
		while(resultSet.next())
		{
		System.out.println("in rs");
		ai.setDescription(resultSet.getString("Description"));
	
		ai.setMeetingId(resultSet.getInt("MeetingId"));
		}
		
		
		
		preparedStatement=connection.prepareStatement("insert into Minutes.EmployeeComments(ActionId,MeetingId,Description,TimeStamp,Status)  values(?,?,?,?,?)");
		preparedStatement.setInt(1,ai.getActionId());
		preparedStatement.setInt(2,ai.getMeetingId());
		preparedStatement.setString(3,ai.getDescription());
		java.sql.Timestamp  sqlDate = new java.sql.Timestamp(new java.util.Date().getTime());
		preparedStatement.setTimestamp(4, sqlDate);		
		preparedStatement.setInt(5,4);
		
		preparedStatement.execute();
		
		
		
		preparedStatement=connection.prepareStatement("update Minutes.ActionItem set Status=? where ActionItemId=?");
		preparedStatement.setInt(1,4);
		preparedStatement.setInt(2,ai.getActionId());
	
	
		preparedStatement.executeUpdate();
		connection.commit();
		
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	
		
	}

	public void redoStatusUpdate(ActionItem ai) {
		try{
			connection = getConnection();
			connection.setAutoCommit(false);
			
			preparedStatement=connection.prepareStatement("select Description,MeetingId from Minutes.ActionItem where ActionItemId=? ");
			preparedStatement.setInt(1,ai.getActionId());
			resultSet=preparedStatement.executeQuery();			
			while(resultSet.next())
			{
			System.out.println("in rs");
			ai.setDescription(resultSet.getString("Description"));
		
			ai.setMeetingId(resultSet.getInt("MeetingId"));
			}
			
			
			
			preparedStatement=connection.prepareStatement("insert into Minutes.EmployeeComments(ActionId,MeetingId,Description,TimeStamp,Status)  values(?,?,?,?,?)");
			preparedStatement.setInt(1,ai.getActionId());
			preparedStatement.setInt(2,ai.getMeetingId());
			preparedStatement.setString(3,ai.getDescription());
			java.sql.Timestamp  sqlDate = new java.sql.Timestamp(new java.util.Date().getTime());
			preparedStatement.setTimestamp(4, sqlDate);		
			preparedStatement.setInt(5,1);
			
			preparedStatement.execute();
			
			
			
			preparedStatement=connection.prepareStatement("update Minutes.ActionItem set Status=? where ActionItemId=?");
			preparedStatement.setInt(1,1);
			preparedStatement.setInt(2,ai.getActionId());
		
		
			preparedStatement.executeUpdate();
			connection.commit();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
	

}
