package com.practical.DataAccessLayer;
import java.util.*;

public class DataAccessMethods<T> {
	ArrayList<T> itemList = null;
	
	public DataAccessMethods() {
		itemList = new ArrayList<T>();
	}
	
	
	/**
	 * This method add the objects to arraylist
	 * @author Mohit Khandelwal
	 * @param t
	 */
	public void  addNewData(T t) {
		itemList.add(t);		
	}

/**
 * This will return the entire arraylist
 * @return
 */
	public  ArrayList<T> retriveReport() {
		return itemList;
		
	}


}
