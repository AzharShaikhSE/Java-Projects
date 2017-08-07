package com.sbi.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;


import com.sbi.pojo.ActionItem;
import com.sbi.pojo.Meeting;
import com.sbi.pojo.StatusConstants;

public class UpdateMomDao {

	Connection connection = null;
	PreparedStatement preparedStatement=null;
	ResultSet resultSet = null;
	Statement statement=null;
	StatusConstants sc = new StatusConstants();
	public List<Meeting> ml=new ArrayList<Meeting>();
	public List<Meeting> md=new ArrayList<Meeting>();
	public List<ActionItem> ad=new ArrayList<ActionItem>();
	
	
	private Connection getConnection() throws SQLException {
		Connection conn;
		conn = ConnectionFactory.getInstance().getConnection();
		return conn;
	}
	
	public void retrieveMeeting(Meeting m)
	{
		
	try {
		connection = getConnection();
		connection.setAutoCommit(false);
		String queryString = "select Subject,MeetingId from Minutes.Meeting where organizer=?";
		preparedStatement=connection.prepareStatement(queryString);
		
		preparedStatement.setString(1,m.getOrganizer());
	
		
		resultSet=preparedStatement.executeQuery();
		 
		while(resultSet.next())
		{
			Meeting m1 = new Meeting();
			System.out.println("in rs");
			m1.setSubject(resultSet.getString("Subject"));
			m1.setMeetingId(resultSet.getInt("MeetingId"));
			
		
			
			ml.add(m1);
		
		}
	connection.commit();
	} catch (SQLException e) {
		try {
			connection.rollback();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		e.printStackTrace();
	}

	}

	public void retrieveMeetingDetails(Meeting m2) {
		
		try {
			connection = getConnection();
			connection.setAutoCommit(false);
			String queryString = "select Subject,Purpose,Date,DecisionsTaken,MeetingId from Minutes.Meeting where MeetingId=?";
			preparedStatement=connection.prepareStatement(queryString);
			
			preparedStatement.setInt(1,m2.getMeetingId());
		
			
			resultSet=preparedStatement.executeQuery();
			 
			while(resultSet.next())
			{
				System.out.println("in rs");
				
				m2.setSubject(resultSet.getString("Subject"));
				m2.setPurpose(resultSet.getString("Purpose"));
				m2.setDate(resultSet.getString("Date"));
				m2.setDecisionTaken(resultSet.getString("DecisionsTaken"));
				m2.setMeetingId(resultSet.getInt("MeetingId"));
				
			
				
				md.add(m2);
			
			}
		connection.commit();
		} catch (SQLException e) {
			try {
				connection.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		}

		

	}

	public void retrieveActionDetails(ActionItem ai) {
		
		try {
			connection = getConnection();
			connection.setAutoCommit(false);
			String queryString = "select ActionItemId,Description,AssignedToName,Status,ClosureDate from Minutes.ActionItem where MeetingId=?";
			preparedStatement=connection.prepareStatement(queryString);
			
			preparedStatement.setInt(1,ai.getMeetingId());
		
			
			resultSet=preparedStatement.executeQuery();
			 
			while(resultSet.next())
			{
				ActionItem a= new ActionItem();
				System.out.println("in rs of ActionItem Details");
				a.setActionId(resultSet.getInt("ActionItemId"));
				a.setDescription(resultSet.getString("Description"));
				a.setAssignedToName(resultSet.getString("AssignedToName"));
				a.setStatus(resultSet.getInt("Status"));
				/*if(s==sc.minute_open)
				{
					a.setStatus("Open");
				}
				else if(s==sc.minute_assigned)
				{
					a.setStatus("Assigned");
				}
				else if(s==sc.minute_workInProgress)
				{
					a.setStatus("WIP");
				}
				else if(s==sc.minute_readyToClosure)
				{
					a.setStatus("Ready for Closure");
				}
				else if(s==sc.minute_widraw)
				{
					a.setStatus("Widraw");
				}
				else{
					a.setStatus("Closure");
				}
				*/
				a.setClosureDate(resultSet.getString("ClosureDate"));
				
			
				
				ad.add(a);
			
			}
		connection.commit();
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
	