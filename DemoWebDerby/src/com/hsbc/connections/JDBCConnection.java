package com.hsbc.connections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

public class JDBCConnection {
	Connection con;
	Statement st;
	PreparedStatement pst;

	public JDBCConnection() {

	}

	public Connection getConnection() {

		try {
			Class.forName("org.apache.derby.jdbc.ClientDriver");
			MysqlDataSource ds=new MysqlDataSource();   //IT GIVES CONNECTION POOL
			
			con = DriverManager.getConnection("jdbc:derby://localhost:1527/proddb;create=true");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return con;
	}

	public Statement getStatement() {
		try {
			st = this.getConnection().createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return st;
	}

	public PreparedStatement getPreparedStatement(String sql) {

		try {
			pst = this.getConnection().prepareStatement(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pst;
	}

	public void closeConnection() {
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
