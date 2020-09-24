package com.hsbc.utilities;

import java.util.ArrayList;
import java.util.List;

import com.hsbc.model.Electronics;

public class ElectronicsDAOImp implements ElectronicsDAO{
	
	List<Electronics> l;
	
	ElectronicsDAOImp()
	{
		l=new ArrayList<Electronics>();
	}

	@Override
	public void insertFoodItem(Electronics b) {
		l.add(b);
		
	}

	@Override
	public List<Electronics> getAllFoodItems() {
		// TODO Auto-generated method stub
		return this.l;
	}

}
