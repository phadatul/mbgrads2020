package com.hsbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) {
		try {
			Class.forName("org.apache.derby.jdbc.ClientDriver");

			Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/abcd;create=true");

			// insert into helloworld values(1,'abc',99)

			// boolean execute(String) CREATE, ALTER, DROP, TRUNCATE
			// ResultSet executeQuery(String)
			// int executeUpdate(String) INSERT, UPDATE, DELETE
			Statement st = con.createStatement();
			
			st.execute("create table users(username varchar(20),password varchar(20))");
			con.close();

		} catch (ClassNotFoundException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		} catch (SQLException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}

	}

}
