package com.everyDayGoodProducts.bussinessLogicForReport;

import java.util.Comparator;

import com.everyDayGoodProducts.model.FoodItems;

public class CompareByQuantity implements Comparator<FoodItems> {

	@Override
	public int compare(FoodItems o1, FoodItems o2) {
		if (o1.getQuantity() > o2.getQuantity())
			return -1;
		else if (o1.getQuantity() < o2.getQuantity())
			return 1;
		else
			return 0;
	}

}
