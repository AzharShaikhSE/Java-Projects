package com.sbi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sbi.pojo.ActionItem;
import com.sbi.pojo.Meeting;

public class ViewMomDao {


	Connection connection = null;
	PreparedStatement ptmt = null;
	ResultSet resultSet = null;
	int result = 0;
	int minId,meetingId;
	String sub,purpose,date,startdate,enddate,destaken,assignedto,closureDate,org;
	int status,actionId;
	String desc;
	
	
	
	public List<Meeting> lm=new ArrayList<Meeting>();
	public List<ActionItem> lst=new ArrayList<ActionItem>();
	
	
	
	private Connection getConnection() throws SQLException {
		Connection conn;
		conn = ConnectionFactory.getInstance().getConnection();
		return conn;
	}
	
	public void retrieveMid(int meetingId,String empId)
	{
		try {
			System.out.println(empId);
			connection = getConnection();
			ptmt = connection.prepareStatement("select e.MeetingId,m.Subject,m.Purpose,m.Date,m.Start_Time,m.End_Time,m.DecisionsTaken,m.organizer from Minutes.Meeting m join Person.EmployeeAction e on m.MeetingId=e.MeetingId where m.MeetingId="+meetingId+" and e.EmployeeId='"+empId+"'");
			resultSet = ptmt.executeQuery();
			
			while(resultSet.next())
			{	
				Meeting min=new Meeting();
			
				minId=(resultSet.getInt(1));
				sub=(resultSet.getString(2));
				purpose=(resultSet.getString(3));
		        date=(resultSet.getString(4));   //check for error
		        startdate=(resultSet.getString(5)); 
		        enddate=(resultSet.getString(6)); 
		        destaken=(resultSet.getString(7));
		    	
		        org=(resultSet.getString(8)); 
		        
		       	min.setMeetingId(minId);
				min.setSubject(sub);
				min.setPurpose(purpose);
				min.setDate(date);
				min.setStartTime(startdate);
				min.setEndTime(enddate);
				min.setDecisionTaken(destaken);
				min.setOrganizer(org);
				 
				 lm.add(min);
				 
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	public void retrieveStatus(int status,String empId)
	{
		try {
			
			System.out.println(empId);
			connection = getConnection();
			System.out.println(status);
			ptmt = connection.prepareStatement("select * from Minutes.ActionItem where Status ="+status+" and AssignedToName=(select EmployeeName from HumanResources.Employee where EmployeeId='"+empId+"')");
		
			resultSet = ptmt.executeQuery();
			System.out.println("abc");	
			while(resultSet.next())
				
			{
				ActionItem ai=new ActionItem();
				
				desc=(resultSet.getString(1));
				assignedto=(resultSet.getString(2));
				status=(resultSet.getInt(3));
				actionId=(resultSet.getInt(4));
				closureDate=(resultSet.getString(5));
				 meetingId=(resultSet.getInt(6));
				org=(resultSet.getString(7)); 
				ai.setActionId(actionId);
				ai.setDescription(desc);
				ai.setAssignedToName(assignedto);
				ai.setClosureDate(closureDate);
				ai.setStatus(status);
				ai.setMeetingId( meetingId);
				ai.setOrganizer(org);
				
				
				
				 lst.add(ai);
				 
				 
				 
			}
			System.out.println(lst);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	public void retrieveDate(String date,String empId)
	{
		System.out.println("in date dao");
		try {
			System.out.println(empId);
			String sql="select e.MeetingId,m.Subject,m.Purpose,m.Date,m.Start_Time,m.End_Time,m.DecisionsTaken,m.organizer from Minutes.Meeting m,Person.EmployeeAction e where m.MeetingId=e.MeetingId and m.Date='"+date+"' and e.EmployeeId='"+empId+"' ";
			connection = getConnection();
			ptmt = connection.prepareStatement(sql);
		/*	ptmt.setString(1, date);
			ptmt.setString(2,empId);
			ptmt.setString(3,empId);*/
			System.out.println("This is date");
			resultSet = ptmt.executeQuery();
			System.out.println(resultSet);
			lm.clear();
			while(resultSet.next())
			{
				Meeting min=new Meeting();
				System.out.println("in date select");
				minId=(resultSet.getInt(1));
				sub=(resultSet.getString(2));
				purpose=(resultSet.getString(3));
		        date=(resultSet.getString(4));   //check for error
		        startdate=(resultSet.getString(5)); 
		        enddate=(resultSet.getString(6)); 
		        destaken=(resultSet.getString(7));
		        org=(resultSet.getString(8)); 
		        
			min.setMeetingId(minId);
			min.setSubject(sub);
			min.setPurpose(purpose);
			min.setDate(date);
			min.setStartTime(startdate);
			min.setEndTime(enddate);
			min.setDecisionTaken(destaken);
			min.setOrganizer(org);
			lm.add(min);
				 
				 
				 
			}
			System.out.println(lm);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	/*public void retrieveDateEmployee(String date,String empId)
	{
		System.out.println("in date dao");
		try {
			System.out.println(empId);
			String sql=" select e.MeetingId,m.Subject,m.Purpose,m.Date,m.Start_Time,m.End_Time,m.DecisionsTaken,m.organizer from Minutes.Meeting m,Person.EmployeeAction e where m.MeetingId=e.MeetingId and m.Date='"+date+"' and e.EmployeeId='"+empId+"'";
			connection = getConnection();
			ptmt = connection.prepareStatement(sql);
			ptmt.setString(1, date);
			ptmt.setString(2,empId);
			ptmt.setString(3,empId);
			System.out.println("This is date");
			resultSet = ptmt.executeQuery();
			System.out.println(resultSet);
			lm.clear();
			while(resultSet.next())
			{
				Meeting min=new Meeting();
				System.out.println("in date select");
				minId=(resultSet.getInt(1));
				sub=(resultSet.getString(2));
				purpose=(resultSet.getString(3));
		        date=(resultSet.getString(4));   //check for error
		        startdate=(resultSet.getString(5)); 
		        enddate=(resultSet.getString(6)); 
		        destaken=(resultSet.getString(7));
		        org=(resultSet.getString(8)); 
		        
			min.setMeetingId(minId);
			min.setSubject(sub);
			min.setPurpose(purpose);
			min.setDate(date);
			min.setStartTime(startdate);
			min.setEndTime(enddate);
			min.setDecisionTaken(destaken);
			min.setOrganizer(org);
			lm.add(min);
				 
				 
				 
			}
			System.out.println(lm);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}*/
	

}
