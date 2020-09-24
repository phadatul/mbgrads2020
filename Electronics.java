package com.hsbc.model;

/*
 * Author: Riya Puri
 * Purpose: This program defines fields and methods used to store Electronics
 */

/*
 * this class is used to store Electronics 
 */
public class Electronics {
	private int itemcode;
	private String itemname;
	private float unitprice;
	private int warrantyinmonths;
	private int quantity;
	
	public Electronics()  //Default Constructor
	{
		
	}

	public Electronics(int itemcode, String itemname, float unitprice, int warrantyinmonths, int quantity) {
		super();             //Constructor to initialize Electronics values
		this.itemcode = itemcode;
		this.itemname = itemname;
		this.unitprice = unitprice;
		this.warrantyinmonths = warrantyinmonths;
		this.quantity = quantity;
	}  

	
	/*
	 * getters and setters for Electronics
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

	public int getWarrantyinmonths() {
		return warrantyinmonths;
	}

	public void setWarrantyinmonths(int warrantyinmonths) {
		this.warrantyinmonths = warrantyinmonths;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	/*
	 * hashcode and equals method defined on the basis of itemcode
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
		Electronics other = (Electronics) obj;
		if (itemcode != other.itemcode)
			return false;
		return true;
	}

	/*
	 * toString method to print Electronics 
	 */
	@Override
	public String toString() {
		return "Electronics [itemcode=" + itemcode + ", itemname=" + itemname + ", unitprice=" + unitprice
				+ ", warrantyinmonths=" + warrantyinmonths + ", quantity=" + quantity + "]";
	}
	
	

}
