package com.sbi.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	String dbUser = "sa";
	String dbPwd = "Password1";
	String connectionUrl="jdbc:odbc:sbidsn";
	private static ConnectionFactory connectionFactory = null;

	private ConnectionFactory() {
		try {
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public Connection getConnection() throws SQLException {
		Connection con = DriverManager.getConnection(connectionUrl,dbUser,dbPwd);
		return con;
	}
	
	 public static ConnectionFactory getInstance() {                
		 if (connectionFactory == null)
		 {                        
			 connectionFactory = new ConnectionFactory();                
			 }                
		 return connectionFactory;        
		 }
}
