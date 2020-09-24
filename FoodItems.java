package com.hsbc.model;

/*
 *Author: Riya Puri
 *Purpose: THis program defines fields and methods used to store Food Items
 */


/*
 * This class is used to store Food Items
 */
public class FoodItems {
	
	private int itemcode;
	private String itemname;
	private float unitprice;
	private String dateofmanufacture;
	private String dateofexpiry;
	private boolean veg;
	private int quantity;
	public FoodItems() //Default Constructor of Food Items
	{}
	public FoodItems(int itemcode, String itemname, float unitprice, String dateofmanufacture, String dateofexpiry,
			boolean veg, int quantity) {   // Constructor to store Food Items
		super();
		this.itemcode = itemcode;
		this.itemname = itemname;
		this.unitprice = unitprice;
		this.dateofmanufacture = dateofmanufacture;
		this.dateofexpiry = dateofexpiry;
		this.veg = veg;
		this.quantity = quantity;
	}
	
	/*
	 * getters and setters for all food items
	 */
	public int getItemcode() {
		return itemcode;
	}
	public void setItemcode(int itemcode) {
		this.itemcode = itemcode;
	}
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public float getUnitprice() {
		return unitprice;
	}
	public void setUnitprice(float unitprice) {
		this.unitprice = unitprice;
	}
	public String getDateofmanufacture() {
		return dateofmanufacture;
	}
	public void setDateofmanufacture(String dateofmanufacture) {
		this.dateofmanufacture = dateofmanufacture;
	}
	public String getDateofexpiry() {
		return dateofexpiry;
	}
	public void setDateofexpiry(String dateofexpiry) {
		this.dateofexpiry = dateofexpiry;
	}
	public boolean isVeg() {
		return veg;
	}
	public void setVeg(boolean veg) {
		this.veg = veg;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	/*
	 * Equals Method and hashcode method defined on the basis of itemcode
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + itemcode;
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
		if (itemcode != other.itemcode)
			return false;
		return true;
	}
	/*
	 * ToString Method to print FoodItems value
	 */
	@Override
	public String toString() {
		return "FoodItems [itemcode=" + itemcode + ", itemname=" + itemname + ", unitprice=" + unitprice
				+ ", dateofmanufacture=" + dateofmanufacture + ", dateofexpiry=" + dateofexpiry + ", veg=" + veg
				+ ", quantity=" + quantity + "]";
	}
	
	
	
	
	

}
