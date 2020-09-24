package com.hsbc.training.entityClasses;
/**
 * 
 * @author Neha Balasubramanian
 *
 * ENTITY CLASS.
 */

public class Electronics {

	int itemCode;
	String itemName;
	int unitPrice;
	int warrantyInMonths;
	int quantity;
	
	//CONSTRUCTORS
	public Electronics(int itemCode, String itemName, int unitPrice, int warrantyInMonths, int quantity) {
		super();
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.unitPrice = unitPrice;
		this.warrantyInMonths = warrantyInMonths;
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

	public int getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getWarrantyInMonths() {
		return warrantyInMonths;
	}

	public void setWarrantyInMonths(int warrantyInMonths) {
		this.warrantyInMonths = warrantyInMonths;
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
				+ ", warrantyInMonths=" + warrantyInMonths + ", quantity=" + quantity + "]";
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
