package com.sbi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ActionOfMeetingDao {

	String eid = null;

	Connection connection = null;
	PreparedStatement ptmt = null;
	ResultSet resultSet = null;
	int result = 0;

	private Connection getConnection() throws SQLException {
		Connection conn;
		conn = ConnectionFactory.getInstance().getConnection();
		return conn;
	}

}
