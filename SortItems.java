package com.hsbc.logic;

import java.util.Collections;
import java.util.List;

/*
 * @author: Sukriti Shukla
 * purpose: to sort items
 */

public class SortItems {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void sortFoodByQuantity(List list)
	{
		Collections.sort(list, new CompareFoodByQuantity());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void sortApparelByQuantity(List list)
	{
		Collections.sort(list, new CompareApparelByQuantity());
	}
	
	@SuppressWarnings("unchecked")
	public static void sortElectronicsByQuantity(@SuppressWarnings("rawtypes") List list)
	{
		Collections.sort(list, new CompareElectronicsByQuantity());
	}
}
