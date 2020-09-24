package com.hsbc.retail.productstructure;

public class RetailProducts {
	
	private int itemCode;
	private String itemName;
	private double unitPrice;
	private int quantity;
	
	public RetailProducts() {}
	
	public RetailProducts(int itemCode, String itemName, double unitPrice, int quantity) {
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.unitPrice = unitPrice;
		this.quantity = quantity;
	}

	public int getItemCode() {
		return itemCode;
	}

	public void setItemCode(int itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public int hashCode() {
		return this.itemCode;
	}

	@Override
	public boolean equals(Object obj) {
		RetailProducts rp = (RetailProducts) obj;
		if(this.itemCode == rp.itemCode) {
			return true;
		} 
		else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "RetailProducts [itemCode=" + itemCode + ", itemName=" + itemName + ", unitPrice=" + unitPrice
				+ ", quantity=" + quantity + "]";
	}
	
	
	
}
