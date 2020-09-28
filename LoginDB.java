package com.hsbc.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.hsbc.connection.DBConnection;

public class LoginDB {

	DBConnection db = new DBConnection();

	public void insertUser(String username, String password) {

		try {
			PreparedStatement ps = db.getPreparedStatement("insert into users values(?,?)");
			ps.setString(1, username);
			ps.setString(2, password);
			ps.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public List getUsers() {
		List l = new ArrayList();
		try {
			Statement st = db.getStatement();
			ResultSet rs = st.executeQuery("Select * from users");
			while (rs.next()) {
				l.add(rs.getString(1) + " " + rs.getString(2));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return l;
	}
}
