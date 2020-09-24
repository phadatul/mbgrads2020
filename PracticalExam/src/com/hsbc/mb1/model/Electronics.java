package com.hsbc.mb1.model;

public class Electronics extends Items{
	
	private int warranty;
	public Electronics(String itemName, int itemCode, int itemQuantity, double itemPrice, int warranty) {
		super(itemName, itemCode, itemQuantity,itemPrice);
		this.warranty=warranty;
	}

}
