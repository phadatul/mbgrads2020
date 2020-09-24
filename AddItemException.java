package com.hsbc.retail.exceptions;

public class AddItemException extends Exception{
	public AddItemException() {
		super("The item code already exists. Cannot the add the item.");
	}
}
