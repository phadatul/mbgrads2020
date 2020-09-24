package com.everyDayGoodProducts.bussinessLogicForReport;

import java.util.Collections;
import java.util.List;

/**
 * This class sorts the items on the basis of their quantity which is basically DESCENDS the quantity of item
 * @author lenovo
 *
 */
public class sortByQuantity {
	
	public static void sortByQuantity(List l) {
		Collections.sort(l, new CompareByQuantity());
		
	}
	public static void sortApparelByQuantity(List l) {
		Collections.sort(l, new CompareApparelByQuantity());
		
	}
	public static void sortElelctronicsByQuantity(List l) {
		Collections.sort(l, new CompareElectronicsByQuantity());
		
	}

}
