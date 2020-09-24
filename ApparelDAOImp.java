package com.hsbc.utilities;

import java.util.ArrayList;
import java.util.List;

import com.hsbc.model.Apparel;

public class ApparelDAOImp implements ApparelDAO{
	List<Apparel> l;
	
	public ApparelDAOImp()
	{
		l=new ArrayList<Apparel>();
	}

	@Override
	public void insertFoodItem(Apparel b) {
		l.add(b);
		
	}

	@Override
	public List<Apparel> getAllFoodItems() {
		// TODO Auto-generated method stub
		return this.l;
	}

}
