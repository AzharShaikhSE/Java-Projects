package com.sbi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.sbi.pojo.Employee;
import com.sbi.service.LoginService;

public class EmployeeDao {

	String uid=null;
	String pwd=null;
	//LoginService ls=new LoginService(uid,pwd);
	Connection connection = null;
	PreparedStatement ptmt = null;
	ResultSet resultSet = null;
	public int role;
	private Connection getConnection() throws SQLException {
		Connection conn;
		conn = ConnectionFactory.getInstance().getConnection();
		return conn;
	}

	public boolean findAll(String username,String password,Employee emp ) {
		System.out.println("this is findall");
		try {
			
			String queryString = "SELECT * FROM HumanResources.Employee where EmployeeId='"+username+"' and Password='"+password+"'";
			connection = getConnection();
			ptmt = connection.prepareStatement(queryString);
			resultSet = ptmt.executeQuery();
			while(resultSet.next())
			{	//System.out.println(resultSet.getString(4));
					emp.setEmployeeName(resultSet.getString(4));
				 role=resultSet.getInt(10);
				return true;
			}
			//System.out.println(resultSet.getString(4));
			/*if(resultSet!=null)
			 {
				 System.out.println("Authorized");
				 return true;
			 }*/
//			while (resultSet.next()) {
//				
//				 if(resultSet!=null)
//				 {
//					 System.out.println("Authorized");
//					 return true;
//				 }
//				 
//			}
//		
			
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
		return false;
	}
	
	public int getRole()
	{
		return role;
	}
	
}
