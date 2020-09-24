package com.hsbc.logic;

import java.util.Comparator;

import com.hsbc.model.Electronics;


/*
 * @author: Sukriti Shukla
 * purpose: compare FoodItems on basis on quantity
 */

public  class CompareElectronicsByQuantity implements Comparator<Electronics> {
	

		@Override
		public int compare(Electronics o1, Electronics o2) {
			
			if(o1.getQuantity()>o2.getQuantity())
				return 1;
			else if(o1.getQuantity()<o2.getQuantity())
				return -1;
			else
				return 0;
		}

	}
