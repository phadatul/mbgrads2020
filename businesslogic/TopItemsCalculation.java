package com.everyday.businesslogic;

import java.util.Collections;
import java.util.List;

public class TopItemsCalculation {

	public static void sortByQuantity(List list) {
		Collections.sort(list, new CompareItemByCount());
	}
}




