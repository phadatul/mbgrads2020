package com.everyday.datastorage;

public class FoodItems extends Items {
	
	public String dateOfManufacture;
	public String dateOfExpiry;
	public String vegetarian;
	
public FoodItems() {
		
	}

	public FoodItems(int itemCode, String itemName, int unitPrice, String dateOfManufacture, String dateOfExpiry,
			int quantity, String vegetarian) {
		super(itemCode,itemName,unitPrice,quantity);
		
		this.dateOfManufacture = dateOfManufacture;
		this.dateOfExpiry = dateOfExpiry;
		
		this.vegetarian = vegetarian;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((dateOfExpiry == null) ? 0 : dateOfExpiry.hashCode());
		result = prime * result + ((dateOfManufacture == null) ? 0 : dateOfManufacture.hashCode());
		result = prime * result + ((vegetarian == null) ? 0 : vegetarian.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		FoodItems other = (FoodItems) obj;
		if (dateOfExpiry == null) {
			if (other.dateOfExpiry != null)
				return false;
		} else if (!dateOfExpiry.equals(other.dateOfExpiry))
			return false;
		if (dateOfManufacture == null) {
			if (other.dateOfManufacture != null)
				return false;
		} else if (!dateOfManufacture.equals(other.dateOfManufacture))
			return false;
		if (vegetarian == null) {
			if (other.vegetarian != null)
				return false;
		} else if (!vegetarian.equals(other.vegetarian))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "FoodItems [dateOfManufacture=" + dateOfManufacture + ", dateOfExpiry=" + dateOfExpiry + ", vegetarian="
				+ vegetarian + ", itemCode=" + itemCode + ", itemName=" + itemName + ", unitPrice=" + unitPrice
				+ ", quantity=" + quantity + "]";
	}

	
	
	
	
	
	
	
	
	
	

}
