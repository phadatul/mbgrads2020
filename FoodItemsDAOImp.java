package com.hsbc.utilities;

import java.util.ArrayList;
import java.util.List;

import com.hsbc.model.FoodItems;

public class FoodItemsDAOImp implements FoodItemsDAO{
	
	List<FoodItems> l;
	
	public FoodItemsDAOImp()
	{
		l=new ArrayList<FoodItems>();
	}

	@Override
	public void insertFoodItem(FoodItems b) {
		l.add(b);
		
	}

	@Override
	public List<FoodItems> getAllFoodItems() {
		// TODO Auto-generated method stub
		return this.l;
	}

}
