package com.practical.EntityClasses;
/**
 * This is entity class for Apparel item
 * @author Mohit Khandelwal
 *
 */

public class Apparel {
	// Basic parameters for class
	private int itemCode;
	private String itemName;
	private double unitPrice;
	private int size;
	private String material;
	private int quantity;
	
	public Apparel() {
		// TODO Auto-generated constructor stub
	}

	public Apparel(int itemCode, String itemName, double unitPrice, int size, String material, int quantity) {
		super();
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.unitPrice = unitPrice;
		this.size = size;
		this.material = material;
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Apparel [itemCode=" + itemCode + ", itemName=" + itemName + ", unitPrice=" + unitPrice + ", size="
				+ size + ", material=" + material + ", quantity=" + quantity + "]";
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

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
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
		Apparel other = (Apparel) obj;
		if (itemCode != other.itemCode)
			return false;
		return true;
	}
	
	

}
