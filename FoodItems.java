package com.hsbc.retail.productstructure;

public class FoodItems extends RetailProducts {
	private String dateOfManufacture;
	private String dateOfExpiry;
	private String vegetarian;

	public FoodItems() {
		super();
	}

	public FoodItems(int itemCode, String itemName, double unitPrice, int quantity, String dateOfManufacture,
			String dateOfExpiry, String vegetarian) {
		super(itemCode, itemName, unitPrice, quantity);
		this.dateOfManufacture = dateOfManufacture;
		this.dateOfExpiry = dateOfExpiry;
		this.vegetarian = vegetarian;
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
		return vegetarian;
	}

	public void setVegetarian(String vegetarian) {
		this.vegetarian = vegetarian;
	}

	@Override
	public String toString() {
		return "FoodItems [ItemCode=" + getItemCode() + ", ItemName=" + getItemName() + ", QuantitySold="
				+ getQuantity() + ", vegetarian=" + vegetarian + "]";

	}
}
