package com.hsbc.entityclasses;

import java.util.Date;

/**
 * This class is a specializes the concept of an Food item (which is a product).
 * 
 * @author Jayprakash Chawla
 *
 */
public class FoodItem extends Product {

	private String dateOfManufacture;
	private String dateOfExpiry;
	private boolean vegetarian;

	public FoodItem(int itemCode, String itemName, int i, int quantity, String dateOfManufacture, String dateOfExpiry,
			int j) {
		super(itemCode, itemName, i, quantity);
		// TODO Auto-generated constructor stub
		this.dateOfManufacture = dateOfManufacture;
		this.dateOfExpiry = dateOfExpiry;
		this.vegetarian = vegetarian;

	}

	@Override
	public String toString() {
		return "FoodItem" + super.toString() + " [dateOfManufacture=" + dateOfManufacture + ", dateOfExpiry="
				+ dateOfExpiry + ", vegetarian=" + vegetarian + "]";
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

	public Boolean getVegetarian() {
		return vegetarian;
	}

	public void setVegetarian(Boolean vegetarian) {
		this.vegetarian = vegetarian;
	}

}
