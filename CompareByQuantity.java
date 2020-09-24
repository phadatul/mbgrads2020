package com.hsbc.sorting;

import java.util.Comparator;

import com.hsbc.datamodel.Category;
import com.hsbc.datamodel.FoodItems;

public  class CompareByQuantity implements Comparator<FoodItems> {

	@Override
	public int compare(FoodItems o1, FoodItems o2) {
		if(o1.getQuantity()>o2.getQuantity())
			return 1;
		else if(o1.getQuantity()<o2.getQuantity())
		{
			return -1;
			
		}
		else
			return 0;
		
		
	}
	

}
