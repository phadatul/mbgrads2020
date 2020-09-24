package com.hsbc.training.entityClasses;

import java.util.Date;
/**
 * 
 * @author Neha Balasubramanian
 *
 * ENTITY CLASS
 */

public class FoodItems {
	
	private int itemCode;
	private String itemName;
	private int unitPrice;
	private Date dateOfManufacture;
	private Date dateOfExpiry;
	private boolean vegetarian;
	private int quantity;
	
	//CONSTRUCTORS
	
//	public FoodItems() {
//		// TODO Auto-generated constructor stub
//	}
	
	public FoodItems(int itemCode, String itemName, int unitPrice, Date dateOfManufacture, Date dateOfExpiry,
			boolean vegetarian, int quantity) {
		super();
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.unitPrice = unitPrice;
		this.setDateOfManufacture(dateOfManufacture);
		this.setDateOfExpiry(dateOfExpiry);
		this.vegetarian = vegetarian;
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

	public Date getDateOfManufacture() {
		return dateOfManufacture;
	}

	public void setDateOfManufacture(Date dateOfManufacture) {
		this.dateOfManufacture = dateOfManufacture;
	}

	public Date getDateOfExpiry() {
		return dateOfExpiry;
	}

	public void setDateOfExpiry(Date dateOfExpiry) {
		this.dateOfExpiry = dateOfExpiry;
	}

	public boolean isVegetarian() {
		return vegetarian;
	}

	public void setVegetarian(boolean vegetarian) {
		this.vegetarian = vegetarian;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "FoodItems [itemCode=" + itemCode + ", itemName=" + itemName + ", unitPrice=" + unitPrice
				+ ", dateOfManufacture=" + dateOfManufacture + ", dateOfExpiry=" + dateOfExpiry + ", vegetarian="
				+ vegetarian + ", quantity=" + quantity + "]";
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
