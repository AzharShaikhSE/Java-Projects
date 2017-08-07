package com.sbi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.sbi.pojo.Employee;

public class DropdownList {
	
	public List<Employee> ls=new ArrayList<Employee>();
		Connection connection = null;
		PreparedStatement ptmt = null;
		ResultSet resultSet = null;
		
		private Connection getConnection() throws SQLException {
			Connection conn;
			conn = ConnectionFactory.getInstance().getConnection();
			return conn;
		}
			public void getValues() throws SQLException
			{
				
				
				connection = getConnection();
				Statement st=connection.createStatement();
				String sql="select * from HumanResources.Employee";
				ResultSet rs=st.executeQuery(sql);
				while(rs.next())
				{	Employee emp=new Employee();
					String empId=rs.getString(1);
					System.out.println("dropdown"+empId);
					emp.setEmployeeId(empId);
					
					String empName=rs.getString(4);
					emp.setName(empName);
					
					
					//System.out.println(rs.getString(4));
					ls.add(emp);
				}

				
			}
	}


