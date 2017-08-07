package com.sbi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sbi.pojo.ActionItem;
import com.sbi.pojo.Meeting;
import com.sbi.pojo.StatusConstants;

public class DashBoardDao {
	Connection conn=null;
	PreparedStatement pstm=null;
	ResultSet resultSet1=null,resultSet2=null,resultSet3=null,resultSet4=null,resultSet5=null,resultSet6=null;
	int result=0;
	int mid;
	//String assigned_id=null;
	ActionItem action=new ActionItem();
	StatusConstants sc=new StatusConstants();
	
	Connection connection = null;
	int rs;
	private Connection getConnection() throws SQLException
	{
	    Connection conn;
		conn=ConnectionFactory.getInstance().getConnection();
		return conn;
		
	}
	
	
	public int display()
	{
		
		try {
			String queryString1="SELECT count(meetingId) from Minutes.Meeting";
			connection = getConnection();
			pstm=connection.prepareStatement(queryString1);
			resultSet1=pstm.executeQuery();
			
			while(resultSet1.next())
			{
				 rs=resultSet1.getInt(1);
				
			}
			
		}
			
	catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
		
	}
		
	
	public int display1()
	{
		
		try {
			String queryString2="SELECT count(ActionItemId) from Minutes.ActionItem where Status='"+sc.minute_open+"'";
			connection = getConnection();
			pstm=connection.prepareStatement(queryString2);
			resultSet2 = pstm.executeQuery();

			while(resultSet2.next())
			{
				 rs=resultSet2.getInt(1);
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
		
	}
		
	public int  display2()
	{
	
		try {
			String queryString3="SELECT count(ActionItemId) from Minutes.ActionItem where status='"+sc.minute_assigned+"'";
			connection = getConnection();
			pstm=connection.prepareStatement(queryString3);
			resultSet3 = pstm.executeQuery();
			while(resultSet3.next())
			{	System.out.println("Assigned");
				 rs=resultSet3.getInt(1);
				 System.out.println(rs);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return rs;
	}
	
	
	public int display3()
	{
		
		try {
			String queryString4="SELECT count(ActionItemId) from Minutes.ActionItem where status='"+sc.minute_workInProgress+"'";
			
			connection = getConnection();
			pstm=connection.prepareStatement(queryString4);
			resultSet4=pstm.executeQuery();
			while(resultSet4.next())
			{	
				 rs=resultSet4.getInt(1);
				 System.out.println(rs);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}
	
	
	public int display4()
	{
		try {
			
			String queryString5="SELECT count(ActionItemId) from Minutes.ActionItem where status='"+sc.minute_readyToClosure+"'";
			connection = getConnection();
			pstm=connection.prepareStatement(queryString5);
			ResultSet resultSet5 = pstm.executeQuery();
			while(resultSet5.next())
			{
				 rs=resultSet5.getInt(1);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}
	
	
	public int display5()
	{
		try {
			String queryString6="SELECT count(ActionItemId) from Minutes.ActionItem where status='"+sc.minute_closure+"'";
			
			connection = getConnection();
			pstm=connection.prepareStatement(queryString6);
			ResultSet resultSet6 = pstm.executeQuery();
			while(resultSet6.next())
			{
				 rs=resultSet6.getInt(1);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}
		
		
}
	
