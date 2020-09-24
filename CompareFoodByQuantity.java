package com.hsbc.logic;

import java.util.Comparator;

import com.hsbc.model.FoodItem;

/*
 * @author: Sukriti Shukla
 * purpose: compare FoodItems on basis on quantity
 */

public class CompareFoodByQuantity implements Comparator<FoodItem> {
	

		@Override
		public int compare(FoodItem o1, FoodItem o2) {
			
			if(o1.getQuantity()>o2.getQuantity())
				return 1;
			else if(o1.getQuantity()<o2.getQuantity())
				return -1;
			else
				return 0;
		}

	}

	


