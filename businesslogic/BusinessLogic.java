package com.everyday.businesslogic;

import java.util.ArrayList;
import java.util.List;

import com.everyday.datastorage.FoodItems;

public class BusinessLogic<T>  {
	ArrayList<T> list ;
	public BusinessLogic () {
		// TODO Auto-generated constructor stub
		list = new ArrayList<T>();
	}

	
	public void addItems(T o) {
		
		list.add(o);
		
		}
	
	public List<T> getItems() {
		return this.list;
	}

	
	

}
