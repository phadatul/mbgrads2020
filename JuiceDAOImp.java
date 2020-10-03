package com.hsbc.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.derby.client.am.SqlException;

public class JuiceDAOImp implements JuiceDAO{

	Statement st;
	PreparedStatement pst;
	JDBCConnection db;
	
	public JuiceDAOImp() {
		// TODO Auto-generated constructor stub
		db = new JDBCConnection();
	}

	@Override
	public List<Juice> getAllJuice() {
		List<Juice> juiceList = new ArrayList<Juice>();
		
		try
		{
			st = db.getStatement();
			ResultSet rs = st.executeQuery("select * from juice");
			while(rs.next())
			{
				Juice temp = new Juice(rs.getInt(1), rs.getString(2), rs.getInt(3));
				juiceList.add(temp);
			}
		}
		catch (SqlException e)
		{
			e.printStackTrace();
		}
		return juiceList;
	}

	@Override
	public void insertJuice(Juice j) {
		try {
			pst = db.getPreparedStatement("insert into juice values(?,?,?)");
			pst.setInt(1, j.getJid());
			pst.setString(2, j.getJname());
			pst.setDouble(3, j.getPrice());

			pst.execute();
			db.closeConnection();
		} 
		catch (SQLException ex) {
			ex.printStackTrace();
		}
		
	}

	@Override
	public void deleteJuice(Juice j) {
		try {
			pst = db.getPreparedStatement("delete from juice where jid=?");
			pst.setInt(1, j.getJid());

			pst.execute();
			db.closeConnection();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		
	}

	@Override
	public void updateJuice(Juice j) {
		try {
			pst = db.getPreparedStatement("update juice set price=? , jname=? where jid=?");
			pst.setInt(3, j.getJid());
			pst.setString(2, j.getJname());
			pst.setInt(1, j.getPrice());

			pst.execute();
			db.closeConnection();
		} 
		catch (SQLException ex) {
			ex.printStackTrace();
		}
		
	}

	@Override
	public Juice findJuice(int jid) {
		Juice j = null;
		try {
			st = db.getStatement();
			ResultSet rs = st.executeQuery("select * from juice where jid=" + jid);
			while (rs.next()) {
				j = new Juice(rs.getInt(1), rs.getString(2), rs.getInt(3));

			}
		} catch (SQLException ex)
		{
			ex.printStackTrace();
		}

		return j;
	}

	@Override
	public List<Juice> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
}
