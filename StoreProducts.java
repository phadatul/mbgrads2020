package com.hsbc.retail.utility;

import java.util.ArrayList;
import com.hsbc.retail.productstructure.RetailProducts;
import com.hsbc.retail.exceptions.*;

@SuppressWarnings("hiding")
public class StoreProducts<RetailProducts> {
	private ArrayList<RetailProducts> al = new ArrayList<RetailProducts>();

	public void addProduct(RetailProducts rp) throws AddItemException {
		int i = 0;
		while (i < al.size()) {
			RetailProducts r = al.get(i);
			if (r.equals(rp)) {
				throw new AddItemException();
			}
		}
		this.al.add(rp);
	}

	public void getReport() throws CategoryNotPresentException {
		if (al.isEmpty()) {
			throw new CategoryNotPresentException();
		}
		int i = 0;
		while (i < al.size()) {
			RetailProducts rp = al.get(i);
			System.out.println(rp);
		}
	}

	public ArrayList<RetailProducts> getProducts() {
		return this.al;
	}

}
