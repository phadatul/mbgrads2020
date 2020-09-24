package com.hsbc.entityclasses;

/**
 * This class is a specializes the concept of an Apparel item (which is a
 * product).
 * 
 * @author Jayprakash Chawla
 *
 */
public class Apparel extends Product {

	private String size;
	private String material;

	public Apparel(int itemCode, String itemName, double unitPrice, int quantity, String size, String material) {
		super(itemCode, itemName, unitPrice, quantity);
		this.size = size;
		this.material = material;
	}

	@Override
	public String toString() {
		return "Apparel " + super.toString() + "[size=" + size + ", material=" + material + "]";
	}

}
