package com.hsbc.todolist.connectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {
	private Connection con;
	private PreparedStatement pst;
	private Statement st;

	public DBConnection() {
		try {
			Class.forName("org.apache.derby.jdbc.ClientDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public Statement getStatement() {
		try {
			this.con = DriverManager.getConnection("jdbc:derby://localhost:1527/fullstackdb;create=true");
			this.st = this.con.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return this.st;
	}

	public PreparedStatement getPreparedStatement(String sql) {
		try {
			this.con = DriverManager.getConnection("jdbc:derby://localhost:1527/fullstackdb;create=true");
			this.pst = this.con.prepareStatement(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return this.pst;
	}
	public void closeConnection() {
		try {
			this.con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
