package com.hsbc.model;

import java.util.List;

public interface JuiceDAO {
		
	public List<Juice> getAll();

	public Juice findJuice(int jid);

	public void insertJuice(Juice j);

	public void updateJuice(Juice j);

	public void deleteJuice(Juice j);

	List<Juice> getAllJuice();

}

