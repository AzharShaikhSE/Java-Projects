package com.sbi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.sql.Time;

import com.sbi.pojo.Meeting;

public class MomDao {

	Connection connection = null;
	PreparedStatement ptmt = null;
	ResultSet resultSet = null;
	int result = 0;

	private Connection getConnection() throws SQLException {
		Connection conn;
		conn = ConnectionFactory.getInstance().getConnection();
		return conn;
	}

	public boolean insertz(Meeting meeting) throws SQLException {
		/*
		 * System.out.println("this is insert");
		 * 
		 * System.out.println(subject);
		 * 
		 * System.out.println(purpose); System.out.println(date);
		 * System.out.println(startTime);
		 * 
		 * System.out.println(dtaken); System.out.println(endTime);
		 * System.out.println(organizer);
		 */
		// System.out.println(empname+"   "+actionid+" "+closure+" "+Status);

		try {
			connection = getConnection();
			ptmt = connection
					.prepareStatement("insert into Minutes.Meeting values(?,?,?,?,?,?,?)");

			ptmt.setString(1, meeting.getSubject());
			ptmt.setString(2, meeting.getPurpose());
			ptmt.setString(3, meeting.getDate());
			ptmt.setString(4, meeting.getStartTime());
			ptmt.setString(5, meeting.getEndTime());
			ptmt.setString(6, meeting.getDecisionTaken());
			ptmt.setString(7, meeting.getOrganizer());
			result = ptmt.executeUpdate();

			System.out.println(result + "this is after result");

			if (result == 1) {
				return true;
			}

		}

		catch (SQLException e) {
			// TODO Auto-generated catch block
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

	public int getMeetingId() {
		int meetingId = 0;

		try {
			connection = getConnection();
			Statement st = connection.createStatement();
			String sql = "  select IDENT_CURRENT('Minutes.Meeting')";
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				meetingId = rs.getInt(1);
				System.out.println(meetingId);
			}
			return meetingId;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;

	}
}
