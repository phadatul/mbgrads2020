package com.hsbc.DAO;

import java.sql.PreparedStatement;
import java.util.ArrayList;

import com.hsbc.connections.DBConnection;
import com.hsbc.model.Dictionary;

public class LoadingHelper {
	
	public static void main(String[] args) {
		
		ArrayList<Dictionary> list= new ArrayList<>();
		Dictionary dictionary1= new Dictionary();
		dictionary1.setWord("Foreigner");
		dictionary1.setMeaning("A person born in or coming from other country");
		dictionary1.setSynonym("Alien, Outsider");
		dictionary1.setAntonym("Native, Resident");
		list.add(dictionary1);
		
		Dictionary dictionary2= new Dictionary();
		dictionary2.setWord("Adherent");
		dictionary2.setMeaning("Follower");
		dictionary2.setSynonym("Follower, disciple");
		dictionary2.setAntonym("Rival, Adversary");
		list.add(dictionary2);
		
		Dictionary dictionary3= new Dictionary();
		dictionary3.setWord("Barrier");
		dictionary3.setMeaning("Obstacle");
		dictionary3.setSynonym("Barricade, Obstacle");
		dictionary3.setAntonym("Link, Assistance");
		list.add(dictionary3);
		
		Dictionary dictionary4= new Dictionary();
		dictionary4.setWord("Captivity");
		dictionary4.setMeaning("Imprisonment");
		dictionary4.setSynonym("Imprisonment, Confinement");
		dictionary4.setAntonym("Freedom, Liberty");
		list.add(dictionary4);
		
		Dictionary dictionary5= new Dictionary();
		dictionary5.setWord("Demolish");
		dictionary5.setMeaning("Ruin");
		dictionary5.setSynonym("Ruin, Devastate");
		dictionary5.setAntonym("Repair, Construct");
		list.add(dictionary5);
		
		try {
		DBConnection db= new DBConnection();
		PreparedStatement pst= db.getPreparedStatement("insert into dictionary values(?,?,?,?)");
		for(Dictionary d: list) {
			pst.setString(1, d.getWord());
			pst.setString(2,d.getMeaning());
			pst.setString(3, d.getSynonym());
			pst.setString(4, d.getAntonym());
			pst.executeUpdate();
			
		}
		}
		catch (Exception e) {
			System.err.println(e);
		}
		
	}

}
