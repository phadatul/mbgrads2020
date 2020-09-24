package com.hsbc.training.exceptions;
/**
 * 
 * @author Neha Balasubramanian
 *
 * CUSTOM EXCEPTION IN CASE OF WRONG INPUT
 */

public class InputException extends RuntimeException{
	
	public InputException(String msg) {
		super(msg);
	}

}
