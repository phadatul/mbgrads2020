package com.practical.entity;

/**
 * 
 * @author Swarga Sarkar
 * @purpose This is the Products class which is furthur divided into fooditems, apparel and electronics.
 * this contains all the common features of other three classes
 *
 */

public class Products {
	
	private int itemCode;
	private String itemName;
	private double unit_price;
	private int quantity;
	
	public Products() {
		// TODO Auto-generated constructor stub
	}

	/**
	 *  Parameterised constructor of the parent class
	 * @param itemCode
	 * @param itemName
	 * @param unit_price
	 * @param quantity
	 */
	public Products(int itemCode, String itemName, double unit_price, int quantity) {
		super();
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.unit_price = unit_price;
		this.quantity = quantity;
	}
	/**
	 * Getters and Setters
	 */

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

	public double getUnit_price() {
		return unit_price;
	}

	public void setUnit_price(double unit_price) {
		this.unit_price = unit_price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	// overiding toString() method
	@Override
	public String toString() {
		return "Products [itemCode=" + itemCode + ", itemName=" + itemName + ", quantity=" + quantity + "]";
	}

	// overiding hashCode() method
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + itemCode;
		return result;
	}

	// overiding equals method
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Products other = (Products) obj;
		if (itemCode != other.itemCode)
			return false;
		return true;
	}

	
	
	

}
