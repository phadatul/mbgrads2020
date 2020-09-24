package com.everyDayGoodProducts.storeUtil;

import java.util.ArrayList;

/**
 * This class is being used to have sets of items. For example: set of FoodItems
 * 
 * @author lenovo
 *
 * @param <T>
 */
public class StoreUtil<T> {

	ArrayList<T> listOfItems = new ArrayList<>();

	public void addItem(T l) {
		listOfItems.add(l);
	}
	
	public ArrayList<T> getItems() {
		return this.listOfItems;
		
	}

}
