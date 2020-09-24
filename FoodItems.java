package com.practical.EntityClasses;

/**
 * This is entity class for food item
 * @author Mohit Khandelwal
 *
 */
public class FoodItems {
	// Basic parameters for class
	
	private int itemCode;
	private String itemName;
	private double unitPrice;
	private String dateOfManufacture;
	private String dateOfExpiry;
	private String Vegetarian;
	private int quantity;
	
	public FoodItems() {
		// TODO Auto-generated constructor stub
	}

	public FoodItems(int itemCode, String itemName, double unitPrice, String dateOfManufacture, String dateOfExpiry,
			String vegetarian, int quantity) {
		super();
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.unitPrice = unitPrice;
		this.dateOfManufacture = dateOfManufacture;
		this.dateOfExpiry = dateOfExpiry;
		Vegetarian = vegetarian;
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "FoodItems [itemCode=" + itemCode + ", itemName=" + itemName + ", unitPrice=" + unitPrice
				+ ", dateOfManufacture=" + dateOfManufacture + ", dateOfExpiry=" + dateOfExpiry + ", Vegetarian="
				+ Vegetarian + ", quantity=" + quantity + "]";
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

	public String getDateOfManufacture() {
		return dateOfManufacture;
	}

	public void setDateOfManufacture(String dateOfManufacture) {
		this.dateOfManufacture = dateOfManufacture;
	}

	public String getDateOfExpiry() {
		return dateOfExpiry;
	}

	public void setDateOfExpiry(String dateOfExpiry) {
		this.dateOfExpiry = dateOfExpiry;
	}

	public String getVegetarian() {
		return Vegetarian;
	}

	public void setVegetarian(String vegetarian) {
		Vegetarian = vegetarian;
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
		FoodItems other = (FoodItems) obj;
		if (itemCode != other.itemCode)
			return false;
		return true;
	}
	
	
	
	
	
	

}
