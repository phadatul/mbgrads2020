package com.hsbc.dao;

import java.util.ArrayList;
import java.util.List;

/*
 * @author: Sukriti Shukla
 * purpose: add and retrieve food items 
 */

public class DataAccess<T> {
	
List<T> items=new ArrayList<T>();
	
	public void addRecords(T item)
	{
		items.add(item);
	}
	
	public List<T> getRecords()
	{
		return this.items;
	}
	
	public int numberOfRecords()
	{
		return this.items.size();
	}

}
