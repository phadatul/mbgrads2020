package com.hsbc.util;

import java.util.ArrayList;
import java.util.List;

import com.hsbc.DAO.Interface_methods;
import com.hsbc.inheritance.Apparel;

public class Apparel_data implements Interface_methods<Apparel> {
	

	ArrayList<Apparel> ad;
	
	public Apparel_data()
	{
		 new ArrayList<Apparel>();
	}


	@Override
	public List<Apparel> getAll_Items() {
		return this.ad;
	}

	public void add(List<Apparel> e) {
		ad.add((Apparel) e);
		
	}


}
	

