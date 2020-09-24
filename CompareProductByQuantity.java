package com.practical.services;

import java.util.Comparator;

import com.practical.entity.Products;

/**
 * 
 * @author Swarga Sarkar
 * @purpose This class implements Comparator and compares two Product objects on basis of quantity
 *
 */

public class CompareProductByQuantity implements Comparator<Products>{
	
	/**
	 * @param Products p1, Products p2
	 * compares two Product objects on basis of quantity
	 */

	@Override
	public int compare(Products p1, Products p2) {
		// TODO Auto-generated method stub
		return p1.getQuantity()-p2.getQuantity();
	}

}
