package com.hsbc.retail.productstructure;

public class Electronics extends RetailProducts {
	private int warranty;
	
	public Electronics() {
		super();
	}

	public Electronics(int itemCode, String itemName, double unitPrice, int quantity, int warranty) {
		super(itemCode, itemName, unitPrice, quantity);
		this.warranty = warranty;
	}

	public int getWarranty() {
		return warranty;
	}

	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}

	@Override
	public String toString() {
		return "Electronics [ItemCode=" + getItemCode() + ", ItemName="
				+ getItemName() + ", Quantity Sold=" + getQuantity() + ", Warranty=" + warranty + "]";
	}
		
}
