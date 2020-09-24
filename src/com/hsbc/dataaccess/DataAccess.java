package com.hsbc.dataaccess;

import java.util.ArrayList;
import java.util.List;

import com.hsbc.entityclasses.Product;

/**
 * This class represents Data Access layer.
 * 
 * @author Jayprakash Chawla
 *
 */

public class DataAccess {

	private List<Product> prodList;

	public DataAccess() {
		// TODO Auto-generated constructor stub
		prodList = new ArrayList<>();
	}

	/**
	 * This method adds product to list
	 * @param p
	 */
	public void addNewItem(Product p) {
		this.prodList.add(p);
	}

	/**
	 * This method produces list of items
	 * @return 
	 */
	public List<Product> getAllItems() {
		return this.prodList;
	}
}
