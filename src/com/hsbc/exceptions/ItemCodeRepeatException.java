package com.hsbc.exceptions;

/**
 * This is a custom exception to handle the case when enters a product with an
 * item code which already exists.
 * 
 * @author Jayprakash Chawla
 *
 */
public class ItemCodeRepeatException extends Exception {
	public ItemCodeRepeatException(String s) {
		// TODO Auto-generated constructor stub
		super(s);
	}
}
