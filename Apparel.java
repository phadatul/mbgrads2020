package com.hsbc.model;

/*
 * Author: Riya Puri
 * Purpose: This program defines fields and methods related to Apparel items
 */

/*
 * This Class is used to store Apparel items
 */
public class Apparel {
	private int itemcode;
	private String itemname;
	private float unitprice;
	private String size;
	private String material;
	private int quantity;
	
	public Apparel() //Default Constructor
	{
		
	}

	public Apparel(int itemcode, String itemname, float unitprice, String size, String material, int quantity) {
		super();   //Constructor to store Apparels
		this.itemcode = itemcode;
		this.itemname = itemname;
		this.unitprice = unitprice;
		this.size = size;
		this.material = material;
		this.quantity = quantity;
	}
	
	/*
	 * getters and setters for Apparel items
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

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
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
		Apparel other = (Apparel) obj;
		if (itemcode != other.itemcode)
			return false;
		return true;
	}

	/*
	 * toString method to print apparel items
	 */
	@Override
	public String toString() {
		return "Apparel [itemcode=" + itemcode + ", itemname=" + itemname + ", unitprice=" + unitprice + ", size="
				+ size + ", material=" + material + ", quantity=" + quantity + "]";
	}
	
	
	
	

}
