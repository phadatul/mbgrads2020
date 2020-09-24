package com.practical.EntityClasses;

/**
 * This is entity class for Electronics item
 * @author Mohit Khandelwal
 *
 */

public class Electronics {
	// Basic parameters for class
	private int itemCode;
	private String itemName;
	private double unitPrice;
	private int warranty;
	private int quantity;
	
	public Electronics() {
		// TODO Auto-generated constructor stub
	}

	public Electronics(int itemCode, String itemName, double unitPrice, int warranty, int quantity) {
		super();
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.unitPrice = unitPrice;
		this.warranty = warranty;
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

	public int getWarranty() {
		return warranty;
	}

	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Electronics [itemCode=" + itemCode + ", itemName=" + itemName + ", unitPrice=" + unitPrice
				+ ", warranty=" + warranty + ", quantity=" + quantity + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + itemCode;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Electronics other = (Electronics) obj;
		if (itemCode != other.itemCode)
			return false;
		return true;
	}
	
	

}
