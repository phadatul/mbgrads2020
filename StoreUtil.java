package com.hsbc.utility;

import java.util.ArrayList;
import java.util.List;

public class StoreUtil<T> {

	ArrayList<T> al ;

	public StoreUtil() {
		// TODO Auto-generated constructor stub
		al = new ArrayList<T>();
	}

	public void addRecord(T record) {
		al.add(record);
	}

	public List<T> getRecords() {
		return this.al;
	}

	public int getNumberofRecords() {
		return this.al.size();
	}

}
