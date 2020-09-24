package com.hsbc.model;

/*
 * @author: Sukriti Shukla
 * purpose: model class for food item 
 */

public class FoodItem {
	
	public int itemCode;
	public String itemName;
	public double unitPrice;
	public String dateOfManf;
	public String dateOfExp;
	public String vegetarian;
	public int quantity;

	//deafult constructor
	public FoodItem() {
		// TODO Auto-generated constructor stub
	}
	
	//parametrised constructor

	public FoodItem(int itemCode, String itemName, double unitPrice, String dateOfManf, String dateOfExp,
			String vegetarian, int quantity) {
		super();
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.unitPrice = unitPrice;
		this.dateOfManf = dateOfManf;
		this.dateOfExp = dateOfExp;
		this.vegetarian = vegetarian;
		this.quantity=quantity;
	}

	//getters and setters
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

	public String getDateOfManf() {
		return dateOfManf;
	}

	public void setDateOfManf(String dateOfManf) {
		this.dateOfManf = dateOfManf;
	}

	public String getDateOfExp() {
		return dateOfExp;
	}

	public void setDateOfExp(String dateOfExp) {
		this.dateOfExp = dateOfExp;
	}

	public String isVegetarian() {
		return vegetarian;
	}

	public void setVegetarian(String vegetarian) {
		this.vegetarian = vegetarian;
	}
	

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	
	//overriding toString() method
	@Override
	public String toString() {
		return "FoodItem [itemCode=" + itemCode + ", itemName=" + itemName + ", quantity=" + quantity +", vegetarian=" + vegetarian
				+"]";
	}
	//overriding equals and hashcode

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateOfExp == null) ? 0 : dateOfExp.hashCode());
		result = prime * result + ((dateOfManf == null) ? 0 : dateOfManf.hashCode());
		result = prime * result + itemCode;
		result = prime * result + ((itemName == null) ? 0 : itemName.hashCode());
		result = prime * result + quantity;
		long temp;
		temp = Double.doubleToLongBits(unitPrice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + (vegetarian != null ? 1231 : 1237);
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
		FoodItem other = (FoodItem) obj;
		if (dateOfExp == null) {
			if (other.dateOfExp != null)
				return false;
		} else if (!dateOfExp.equals(other.dateOfExp))
			return false;
		if (dateOfManf == null) {
			if (other.dateOfManf != null)
				return false;
		} else if (!dateOfManf.equals(other.dateOfManf))
			return false;
		if (itemCode != other.itemCode)
			return false;
		if (itemName == null) {
			if (other.itemName != null)
				return false;
		} else if (!itemName.equals(other.itemName))
			return false;
		if (quantity != other.quantity)
			return false;
		if (Double.doubleToLongBits(unitPrice) != Double.doubleToLongBits(other.unitPrice))
			return false;
		if (vegetarian != other.vegetarian)
			return false;
		return true;
	}
	
	
	
	
	
	

}
