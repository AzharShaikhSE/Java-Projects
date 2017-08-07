package com.sbi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.sbi.pojo.EmployeewiseMomsCreated;

public class ViewEmployeeReportsDao {

	
	Connection connection = null;
	PreparedStatement ptmt = null;
	ResultSet resultSet = null;
	int result = 0;

	public EmployeewiseMomsCreated empwiseTotalReport = new EmployeewiseMomsCreated();
	private Connection getConnection() throws SQLException {
		Connection conn;
		conn = ConnectionFactory.getInstance().getConnection();
		return conn;
	}
	
	public EmployeewiseMomsCreated getEmployeewiseMoms(String selectedEmp) {
		try {
			connection = getConnection();
			ptmt = connection
					.prepareStatement("select count(m.MeetingId) from  HumanResources.Employee e " +
							"left outer join Minutes.Meeting m " +
							"on (e.EmployeeId=m.Organizer) where e.EmployeeId='"+selectedEmp+"' group by e.EmployeeId"); 
			
			
			resultSet = ptmt.executeQuery();
			while (resultSet.next()) {
				
				empwiseTotalReport.setTotalMomCreated(resultSet.getInt(1));
				
			}
			
			
			
			
			ptmt = connection
			.prepareStatement("select count(p.Attended) 'meeting attended' from HumanResources.Employee e " +
					"left outer join Person.Attendance p on (e.EmployeeId=p.EmployeeId)" +
					" where p.Attended=1 and  e.EmployeeId='"+selectedEmp+"'group by e.EmployeeId");
			resultSet = ptmt.executeQuery();
			while (resultSet.next()) {
				
				empwiseTotalReport.setTotalMeetingAttended(resultSet.getInt(1));
				
			}
			
			
			ptmt = connection
			.prepareStatement("select count(p.Attended) 'meeting attended' from" +
					" HumanResources.Employee e left outer join Person.Attendance p" +
					" on (e.EmployeeId=p.EmployeeId) " +
					"where p.Attended=0 and e.EmployeeId='"+selectedEmp+"' group by e.EmployeeId,e.EmployeeName");
			resultSet = ptmt.executeQuery();
			while (resultSet.next()) {
				
				
				empwiseTotalReport.setTotalMeetingAbsent(resultSet.getInt(1));
				
			}
			
			ptmt = connection
			.prepareStatement("select EmployeeId,EmployeeName from HumanResources.Employee where EmployeeId='"+selectedEmp+"'");
			resultSet = ptmt.executeQuery();

			while (resultSet.next()) {

				
				empwiseTotalReport.setEmployeeId(resultSet.getString(1));
				empwiseTotalReport.setEmployeeName(resultSet.getString(2));
				
			}
			
			
			
			
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return empwiseTotalReport;
			

	
	}

}
