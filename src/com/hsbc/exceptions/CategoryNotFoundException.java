package com.hsbc.exceptions;

/**
 * This is a custom exception to handle the case when user generates report for
 * invalid category.
 * 
 * @author Jayprakash Chawla
 *
 */
public class CategoryNotFoundException extends Exception {

	public CategoryNotFoundException(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

}
