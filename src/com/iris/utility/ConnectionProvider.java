package com.iris.utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
	private static Connection Conn;
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static Connection getConn() {
		return Conn;
	}

}
