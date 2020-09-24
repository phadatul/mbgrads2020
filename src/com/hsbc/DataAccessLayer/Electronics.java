package com.hsbc.DataAccessLayer;

public class Electronics extends Product {

	private int warranty;

	public Electronics() {
		super();
	}

	public Electronics(int itemCode, String itemName, double unitPrice, int quantity, int warranty, int quantitySold) {
		super();
		this.warranty = warranty;
		super.setItemCode(itemCode);
		super.setItemName(itemName);
		super.setUnitPrice(unitPrice);
		super.setQuantity(quantity);
		super.setQuantitySold(quantitySold);
		super.setCategoryType("Electronics");
	}

	public int getWarranty() {
		return warranty;
	}

	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}

}
