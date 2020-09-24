package com.everyday.businesslogic;

import java.util.Comparator;

import com.everyday.datastorage.Items;

public class CompareItemByCount implements Comparator<T> {

	@Override
	public int compare(Items o1, Items o2) {
		if (o1.quantity > o2.quantity)
			return 1;
		else if (o1.quantity < o2.quantity)
			return -1;
		else
			return 0;

		
	}
	
	


}
