package com.hsbc.sortutil;

import java.util.Comparator;

import com.hsbc.entityclasses.Product;

public class SortWithQuantity implements Comparator<Product> {

	@Override
	public int compare(Product arg0, Product arg1) {
		// TODO Auto-generated method stub
		if (arg0.getQuantity() < arg1.getQuantity()) {
			return 1;
		} else if (arg0.getQuantity() > arg1.getQuantity()) {
			return -1;
		} else {
			return 0;
		}
	}

}
