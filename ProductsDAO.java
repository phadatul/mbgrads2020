package com.practical.DAO;

import java.util.List;

import com.practical.entity.Products;
/**
 * 
 * @author Swarga Sarkar
 * @purpose This is an interface to perform data access operations
 *
 */

public interface ProductsDAO {
	
	/**
	 * 
	 * @param list
	 * @return This Method returns the top three sold items
	 */
	
	public List<Products> getProducts(List list);
	
	/**
	 * 
	 * @param Products
	 * This Method to add a product to the collections
	 */
	public void addProduct(Products p);
	/**
	 * 
	 * This Method returns the List of Same type of Products
	 */
	
	public List<Products> getAllProducts();

}
