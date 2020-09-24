package com.hsbc.Entities;

/*
 * @author Deepanshu Sharma
 * This class contains the blueprint for items of the type Electronics
 */
public class Electronics extends Items {
	int warranty;

	public Electronics(int code, String name, double price, int quantity, int warranty) {
		super(code, name, price, quantity);
		// TODO Auto-generated constructor stub
		this.warranty = warranty;
	}

	public Electronics() {
	}

}
