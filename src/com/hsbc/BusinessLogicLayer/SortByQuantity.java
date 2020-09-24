package com.hsbc.BusinessLogicLayer;

import java.util.Collections;
import java.util.List;

public class SortByQuantity {

	public static void sortByQuantitySold(List list) {
		Collections.sort(list,new CompareByQuanitySold());
	}
	
}
