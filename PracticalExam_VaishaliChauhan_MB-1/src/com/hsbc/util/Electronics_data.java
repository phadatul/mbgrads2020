package com.hsbc.util;

import java.util.ArrayList;
import java.util.List;

import com.hsbc.DAO.Interface_methods;
import com.hsbc.inheritance.Electronics;


public class Electronics_data implements Interface_methods<Electronics> {
	
	ArrayList<Electronics> ed;
	
	public Electronics_data()
	{
		 new ArrayList<Electronics>();
	}


	@Override
	public List<Electronics> getAll_Items() {
		// TODO Auto-generated method stub
		return this.ed;
	}

	public void add(List<Electronics> e) {
		ed.add((Electronics) e);
	}

}
	

