package com.sbi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.sbi.pojo.AdminDeptReportsTotalMom;

public class ViewDeptReportsDao {

	Connection connection = null;
	PreparedStatement ptmt = null;
	ResultSet resultSet = null;
	int result = 0;

	public AdminDeptReportsTotalMom deptwiseTotal = new AdminDeptReportsTotalMom();

	private Connection getConnection() throws SQLException {
		Connection conn;
		conn = ConnectionFactory.getInstance().getConnection();
		return conn;
	}

	public AdminDeptReportsTotalMom getDeptwiseMoms(int selectedOption) {

		try {
			connection = getConnection();

			ptmt = connection
			.prepareStatement("select DepartmentId,DepartmentName from HumanResources.Department where DepartmentId="+selectedOption+"");
	
	resultSet = ptmt.executeQuery();

	while (resultSet.next()) {

		
		deptwiseTotal.setDepartmentId(resultSet.getInt(1));
		deptwiseTotal.setDepartmentName(resultSet.getString(2));
		
			}
	
			
			ptmt = connection
					.prepareStatement("select COUNT(ea.MeetingId) from   HumanResources.Department d "
							+ "left outer join HumanResources.Employee e  "
							+ "on (e.DepartmentId=d.DepartmentId) left outer join Person.EmployeeAction ea "
							+ "on (e.EmployeeId=ea.EmployeeId) where d.DepartmentId="+selectedOption+" group by d.departmentName,d.departmentId ");
			
			resultSet = ptmt.executeQuery();
			while (resultSet.next()) {

				deptwiseTotal.setTotalMomCreated(resultSet.getInt(1));
								
			}

			ptmt = connection
					.prepareStatement("select COUNT(p.Attended) from HumanResources.Department d "
							+ "join HumanResources.Employee e on(d.DepartmentId= e.DepartmentId) "
							+ "join Person.Attendance p on (p.EmployeeId= e.EmployeeId)"
							+ "where p.Attended=1 and d.DepartmentId="+selectedOption+" group by d.DepartmentId");
			
			resultSet = ptmt.executeQuery();

			while (resultSet.next()) {

				deptwiseTotal.setTotalMeetingAttended(resultSet.getInt(1));
				
			}

			ptmt = connection
					.prepareStatement("select COUNT(p.Attended) from HumanResources.Department d "
							+ "join HumanResources.Employee e on(d.DepartmentId= e.DepartmentId) "
							+ "join Person.Attendance p on (p.EmployeeId= e.EmployeeId)"
							+ "where p.Attended=0 and d.DepartmentId="+selectedOption+" group by d.DepartmentId");
			
			resultSet = ptmt.executeQuery();

			while (resultSet.next()) {

				deptwiseTotal.setTotalMeetingAbsent(resultSet.getInt(1));
								
			}
			
			deptwiseTotal.setPercentageAbsent((deptwiseTotal.getTotalMeetingAbsent()*100)/1+(deptwiseTotal.getTotalMeetingAbsent()+deptwiseTotal.getTotalMeetingAttended()));
			
						
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return deptwiseTotal;

	}

}
