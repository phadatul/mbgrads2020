package com.hsbc.retail.comparison;

import java.util.Comparator;

import com.hsbc.retail.productstructure.RetailProducts;

public class CompareProductsByQuantity implements Comparator<RetailProducts>{

	@Override
	public int compare(RetailProducts o1, RetailProducts o2) {
		if(o1.getQuantity() > o2.getQuantity()) {
			return 1;
		}
		else if(o1.getQuantity() < o2.getQuantity()) {
			return -1;
		}
		else {
			return 0;
		}
	}

	

}
