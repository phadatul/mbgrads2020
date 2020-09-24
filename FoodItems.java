package com.hsbc.entity;
/**
 * 
 * @author Siddhant
 *@purpose class Fooditems inherits products
 */

public class FoodItems extends Products {

	private int dateOfManufacture;
	private int dateOfExpiry;
	private String isVegetarian;

	public FoodItems() {
		// TODO Auto-generated constructor stub
	}

	public FoodItems(int itemCode,String itemName,double unitPrice,int quantity,int dateOfManufacture, int dateOfExpiry,
			String isVegetarian) {
		super(itemCode,itemName,unitPrice,quantity);
		this.dateOfManufacture = dateOfManufacture;
		this.dateOfExpiry = dateOfExpiry;
		this.isVegetarian = isVegetarian;
	}

	/**
	 * @return the dateOfManufacture
	 */
	public int getDateOfManufacture() {
		return dateOfManufacture;
	}

	/**
	 * @param dateOfManufacture
	 *            the dateOfManufacture to set
	 */
	public void setDateOfManufacture(int dateOfManufacture) {
		this.dateOfManufacture = dateOfManufacture;
	}

	/**
	 * @return the dateOfExpiry
	 */
	public int getDateOfExpiry() {
		return dateOfExpiry;
	}

	/**
	 * @param dateOfExpiry
	 *            the dateOfExpiry to set
	 */
	public void setDateOfExpiry(int dateOfExpiry) {
		this.dateOfExpiry = dateOfExpiry;
	}

	/**
	 * @return the isVegetarian
	 */
	public String getIsVegetarian() {
		return isVegetarian;
	}

	/**
	 * @param isVegetarian
	 *            the isVegetarian to set
	 */
	public void setIsVegetarian(String isVegetarian) {
		this.isVegetarian = isVegetarian;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "FoodItems [dateOfManufacture=" + dateOfManufacture
				+ ", dateOfExpiry=" + dateOfExpiry + ", isVegetarian="
				+ isVegetarian + "]";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + dateOfExpiry;
		result = prime * result + dateOfManufacture;
		result = prime * result
				+ ((isVegetarian == null) ? 0 : isVegetarian.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		FoodItems other = (FoodItems) obj;
		if (dateOfExpiry != other.dateOfExpiry)
			return false;
		if (dateOfManufacture != other.dateOfManufacture)
			return false;
		if (isVegetarian == null) {
			if (other.isVegetarian != null)
				return false;
		} else if (!isVegetarian.equals(other.isVegetarian))
			return false;
		return true;
	}

}
