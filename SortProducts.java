package com.hsbc.retail.utility;

import java.util.Collections;
import java.util.ArrayList;

import com.hsbc.retail.comparison.CompareProductsByQuantity;

public class SortProducts {
	public static void sortByQuantity(ArrayList l) {
		Collections.sort(l, new CompareProductsByQuantity());
	}
}
