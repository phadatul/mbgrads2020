package com.everyDayGoodProducts.bussinessLogicForReport;

import java.util.Comparator;

import com.everyDayGoodProducts.model.Apparel;

public class CompareApparelByQuantity implements Comparator<Apparel> {

	@Override
	public int compare(Apparel o1, Apparel o2) {
		
		if (o1.getQuantity() > o2.getQuantity())
			return -1;
		else if (o1.getQuantity() < o2.getQuantity())
			return 1;
		else
			return 0;
	}

}
