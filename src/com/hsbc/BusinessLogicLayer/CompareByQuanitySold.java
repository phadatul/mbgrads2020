package com.hsbc.BusinessLogicLayer;

import java.util.Comparator;

import com.hsbc.DataAccessLayer.Product;

public class CompareByQuanitySold implements Comparator<Product> {

	@Override
	public int compare(Product arg0, Product arg1) {
		// TODO Auto-generated method stub
		if (arg0.getQuantitySold() > arg1.getQuantitySold()) {
			return 1;
		} else if (arg0.getQuantitySold() < arg1.getQuantitySold()) {
			return -1;
		} else
			return 0;
	}
	

}
