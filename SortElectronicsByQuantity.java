package com.practical.BusinessLogicLayer;
import java.util.Comparator;

import com.practical.EntityClasses.*;

public class SortElectronicsByQuantity implements Comparator<Electronics> {
	
	/**
	 * This is the Comparator implemented class override comparator() to sort by quantity
	 * @author Mohit Khandelwal
	 */
	@Override
	public int compare(Electronics f1, Electronics f2 ) {
		if(f1.getQuantity() < f2.getQuantity()) {
			return 1;
		}
		else if(f1.getQuantity() > f2.getQuantity()) {
			return -1;
		}
		else {
		return 0;
		}
	}

}