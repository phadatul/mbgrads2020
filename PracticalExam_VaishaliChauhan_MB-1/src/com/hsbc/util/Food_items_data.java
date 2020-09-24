package com.hsbc.util;

import java.util.ArrayList;
import java.util.List;

import com.hsbc.DAO.Interface_methods;
import com.hsbc.inheritance.FoodItems;


public class Food_items_data implements Interface_methods<FoodItems> {
	
	ArrayList<FoodItems> fid;
	
	@Override
	public List<FoodItems> getAll_Items() {
		// TODO Auto-generated method stub
		return this.fid;
	}

	@Override
	public void add(List<FoodItems> e) {
		// TODO Auto-generated method stub
		fid.add((FoodItems) e);
		
	}

	
	
	

	
	

}
