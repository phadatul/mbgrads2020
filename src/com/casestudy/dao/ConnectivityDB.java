package com.casestudy.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectivityDB {
	
	Connection con;
	Statement st;
	PreparedStatement pst;
	
	public ConnectivityDB() {
		
		try {
			Class.forName("org.apache.derby.jdbc.ClientDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public Statement getStatement() {
		try {
			con = DriverManager.getConnection("jdbc:derby://localhost:1527/ProfessionalDB");
			st = con.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return st;
	}

	public PreparedStatement getPreparedStatement(String sql) {
		try {
			con = DriverManager.getConnection("jdbc:derby://localhost:1527/ProfessionalDB");
			pst = con.prepareStatement(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pst;
	}

}
