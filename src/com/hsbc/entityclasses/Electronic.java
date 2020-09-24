package com.hsbc.entityclasses;

/**
 * This class is a specializes the concept of an Electronic item (which is a
 * product).
 * 
 * @author Jayprakash Chawla
 *
 */
public class Electronic extends Product {

	private int warranty;

	public Electronic(int itemCode, String itemName, double unitPrice, int quantity, int warranty) {
		super(itemCode, itemName, unitPrice, quantity);
		this.warranty = warranty;
	}

	
	@Override
	public String toString() {
		
		return "Electronic " + super.toString() + "[warranty=" + warranty + "]";
	}


	public int getWarranty() {
		return warranty;
	}

	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}

}
