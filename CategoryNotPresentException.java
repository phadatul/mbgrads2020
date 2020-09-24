package com.hsbc.retail.exceptions;

public class CategoryNotPresentException extends Exception{
	public CategoryNotPresentException() {
		super("The category for which you are trying to get the report is not present.");
	}
}
