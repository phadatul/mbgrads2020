package com.casestudy.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.casestudy.entityModel.Professional;

public class ServiceByDB {

	ConnectivityDB db = new ConnectivityDB();

	public void insertProf(String profId, String proofName, String basicSalary, String grossSalary, String netSalary) {

		try {
			PreparedStatement ps = db.getPreparedStatement("insert into Professional2 values(?,?,?,?,?)"); 
			ps.setString(1, profId);
			ps.setString(2, proofName);
			ps.setString(3, basicSalary);
			ps.setString(4, grossSalary);
			ps.setString(5, netSalary);
			ps.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void removeProf(String profId) {

		try {
			PreparedStatement ps = db.getPreparedStatement("Delete from Professional2 where profId=(?)");
			ps.setString(1, profId);
			ps.execute();
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

//	public Professional getProf(String profId) {
//		
//		Statement st = db.getStatement();
//		Professional p=null;
//		try {
//			ResultSet rs = st.executeQuery("Select * from Professional2 where profId=" + (profId));
//			while(rs.next()) {
//				p=new Professional(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getDouble(4));
//			}
//			
//			
//		} catch (SQLException e) {
//			
//			e.printStackTrace();
//		}
//		
//		return p;
//
//	}
	
	public void REMOVEDATA() {
		Statement st = db.getStatement();
		try {
			st.executeUpdate("Delete from Professional2");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public ArrayList getAllProf() {
		ArrayList l = new ArrayList();

		Statement st = db.getStatement();
		try {
			ResultSet rs = st.executeQuery("Select * from Professional2");
			while (rs.next()) {
				l.add(rs.getString(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + "  " + rs.getString(4) + "  "
						+ rs.getString(5));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return l;

	}

}
