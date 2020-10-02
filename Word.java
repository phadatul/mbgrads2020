package com.hsbc.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.hsbc.connections.DBConnection;

public class Word {
	
	DBConnection db= new DBConnection();
	
	public String getDetails(String str)
	{
		PreparedStatement pst= db.getPreparedStatement("select * from dictionary where word=?");
		String data=null;
		try {
			pst.setString(1, str);
			ResultSet rs=pst.executeQuery();
			while(rs.next())
			{
				data="Meaning: "+rs.getString(2)+"; Synonym: "+ rs.getString(3)+ "; Antonym: "+ rs.getString(4);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			db.closeConnection();
		}
		return data;
		
	}
	public void addWord(String newword, String meaning, String synonym, String antonym) {
		PreparedStatement pst= db.getPreparedStatement("insert into dictionary values(?,?,?,?) ");
		try {
			pst.setString(1, newword);
			pst.setString(2, meaning);
			pst.setString(3, synonym);
			pst.setString(4, antonym);
			pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			db.closeConnection();
		}
		
		
	}
	public void updateWord(String meaning, String synonym, String antonym,String newword)
	{
		PreparedStatement pst= db.getPreparedStatement("update dictionary set meaning=?, synonyms=?, antonyms=? where word=?");
		try {
			pst.setString(1,meaning);
			pst.setString(2, synonym);
			pst.setString(3, antonym);
			pst.setString(4, newword);
			pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			db.closeConnection();
		}
		
	}

}
