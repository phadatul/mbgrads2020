package com.hsbc.BusinessLogicLayer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Storage<T> {

	ArrayList<T> list = new ArrayList<T>();
	
	public T addProduct(T p) {
		list.add(p);
		return p;
	}
	
	public T removeProduct(T p) {
		list.remove(p);
		return p;
	}
	public List<T> getProductDetails(){
		return this.list;
	}
	public void GetTopthreeProducts (List list) {
		Iterator itr = list.iterator();
		for(int i=0;i<3;i++) {
			System.out.println(((Iterator) list).next());
		}
	}
	
}
