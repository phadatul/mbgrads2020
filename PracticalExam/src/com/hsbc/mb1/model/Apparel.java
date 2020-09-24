package com.hsbc.mb1.model;

public class Apparel extends Items {
	private String size;
	private String material;

	public Apparel(String itemName, int itemCode, int itemQuantity, double itemPrice, String size, String material) {
		super(itemName, itemCode, itemQuantity, itemPrice);
		this.material = material;
		this.size = size;
	}

}
