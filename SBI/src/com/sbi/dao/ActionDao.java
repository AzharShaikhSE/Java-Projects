package com.sbi.dao;

import java.sql.Connection;
import com.sbi.pojo.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;
import java.sql.Statement;

public class ActionDao {
	String eid=null;
	ActionItem action=new ActionItem();
	Attendance attend=new Attendance();
	EmployeeAction empAction=new EmployeeAction();
	EmployeeComments empComment=new EmployeeComments();
	Connection connection = null;
	PreparedStatement ptmt = null;
	ResultSet resultSet = null;
	int result=0;

	private Connection getConnection() throws SQLException {
		Connection conn;
		conn = ConnectionFactory.getInstance().getConnection();
		return conn;
	}

	public String findEmp(String empId ) {
		System.out.println("this is findemp");
		try {
			
			String queryString = "SELECT * FROM HumanResources.Employee where EmployeeId='"+empId+"'";
			connection = getConnection();
			ptmt = connection.prepareStatement(queryString);
			resultSet = ptmt.executeQuery();
			while(resultSet.next())
			{	
				String employeeName=resultSet.getString(4);
				System.out.println(employeeName);
				return employeeName;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} /*finally {
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
		}*/
		return null;
	}
	
	public void insertAction(ActionItem action) {
		System.out.println("this is insert");
		this.action=action;
		//System.out.println(empname+"   "+desc+" "+closure+" "+Status);
			
			try {
				connection = getConnection();
				ptmt = connection.prepareStatement("insert into Minutes.ActionItem(AssignedToName,Description,ClosureDate,Status,meetingId,organizer) values(?,?,?,?,?,?)");
				ptmt.setString(1,action.getAssignedToName()); 
				ptmt.setString(2,action.getDescription()); 
				ptmt.setString(3, action.getClosureDate());
				ptmt.setInt(4, action.getStatus());
				ptmt.setInt(5,action.getMeetingId());
				ptmt.setString(6,action.getOrganizer());
				result = ptmt.executeUpdate();
				
				/*ptmt = connection.prepareStatement("insert into Person.Attendance(Attended) values(?,?,?)");
				ptmt.setString(2,empname); 
*/				
			
			} catch (SQLException e) {
				try {
					connection.rollback();
				} catch (SQLException e1) {
					
					e1.printStackTrace();
				}
				e.printStackTrace();
			}
		/*	while(resultSet.next())
			{	System.out.println(resultSet.getString(1));
				return true;
			}

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
			}*/
		
		
	}
	

	
	public void insertAttendance(Attendance attend) {
		System.out.println("this is insert");
		this.attend=attend;
		//System.out.println(attendance+"   "+meetingId+" "+employeeId);
			
			try {
				connection = getConnection();
				
				
				ptmt=connection.prepareStatement("insert into Person.Attendance values(?,?,?)");
				ptmt.setString(1,attend.getEmployeeId());
				ptmt.setInt(2,attend.getAttendance());
				ptmt.setInt(3,attend.getMeetingId());
				result = ptmt.executeUpdate();
				/*ptmt = connection.prepareStatement("insert into Person.Attendance(Attended) values(?,?,?)");
				ptmt.setString(2,empname); 
*/				
			
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		/*	while(resultSet.next())
			{	System.out.println(resultSet.getString(1));
				return true;
			}

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
			}*/
		
		
	}
	
	
	public void insertEmployeeAction(EmployeeAction empAction) {
		System.out.println("this is insert");
		this.empAction=empAction;
	//	System.out.println(actionId+"   "+meetingId+" "+employeeId);
			
			try {
				connection = getConnection();
				
				
				ptmt=connection.prepareStatement("insert into Person.EmployeeAction values(?,?,?)");
				ptmt.setInt(1,empAction.getActionId());
				ptmt.setString(2,empAction.getEmployeeId());
				ptmt.setInt(3,empAction.getMeetingId());
				result = ptmt.executeUpdate();
				
				
			
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		 finally {
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
		
		
	}
	
	
	public  int findActionId()
	{
		int actionId=0;
	
	
			try {
				connection = getConnection();
				Statement st=connection.createStatement();
				String sql="select IDENT_CURRENT('Minutes.ActionItem')";
				ResultSet rs=st.executeQuery(sql);
				while(rs.next())
				{
					actionId=rs.getInt(1);
					System.out.println(actionId);
				}
				return actionId;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return 0;
	
	

}
	private static java.sql.Timestamp getCurrentTimeStamp() {

		java.util.Date today = new java.util.Date();
		return new java.sql.Timestamp(today.getTime());

	}

	public void insertActionTimeStamp(EmployeeComments empComment) {
		System.out.println("this is insert");
		this.empComment=empComment;
	//	System.out.println(actionId+"   "+meetingId+" "+employeeId);
		
			try {
				connection = getConnection();
				
				
				ptmt=connection.prepareStatement("insert into Minutes.EmployeeComments values(?,?,?,?,?,?)");
				ptmt.setInt(1,empComment.getActionItemId());
				
				ptmt.setInt(2,empComment.getMeetingId());
				ptmt.setString(3,empComment.getDescription());
				java.sql.Timestamp  sqlDate = new java.sql.Timestamp(new java.util.Date().getTime());
                ptmt.setTimestamp(4, sqlDate);
                ptmt.setString(5,empComment.getComments());
                ptmt.setInt(6,empComment.getStatus());

			
				result = ptmt.executeUpdate();
				
				
				/*ptmt = connection.prepareStatement("insert into Person.Attendance(Attended) values(?,?,?)");
				ptmt.setString(2,empname); 
*/				
			
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		/*	while(resultSet.next())
			{	System.out.println(resultSet.getString(1));
				return true;
			}

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
			}*/
		
		
	}
	
	
}
