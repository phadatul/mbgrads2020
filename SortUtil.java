package com.hsbc.utility;

import java.util.Collections;
import java.util.List;

import com.hsbc.filters.CompareBookByName;
import com.hsbc.filters.CompareBookByPrice;

public class SortUtil<T> {

	public static void sortByName(List list) {
		Collections.sort(list, new CompareBookByName());
	}

	public static void sortByPrice(List list) {
		Collections.sort(list, new CompareBookByPrice());
	}
}
