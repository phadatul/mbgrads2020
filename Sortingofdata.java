package com.hsbc.storage;

import java.util.Collections;
import java.util.List;

import com.hsbc.sorting.CompareByQuantity;



public class Sortingofdata<T> {
	
	public static void sortByQuantity(List list) {
		Collections.sort(list, new CompareByQuantity());
	}
}
