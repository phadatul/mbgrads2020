package com.practical.BusinessLogicLayer;
import java.util.Comparator;

import com.practical.EntityClasses.*;

public class SortApparelByQuantity implements Comparator<Apparel> {
	
	/**
	 * This is the Comparator implemented class override comparator() to sort by quantity
	 * @author Mohit Khandelwal
	 */
	@Override
	public int compare(Apparel f1, Apparel f2 ) {
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
