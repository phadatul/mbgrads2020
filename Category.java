package com.hsbc.datamodel;

public class Category {
	protected int itemcode;
	String itemname;
	protected int quantity;
	int unitprice;
	
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
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getUnitprice() {
		return unitprice;
	}
	public void setUnitprice(int unitprice) {
		this.unitprice = unitprice;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + itemcode;
		result = prime * result + ((itemname == null) ? 0 : itemname.hashCode());
		result = prime * result + quantity;
		result = prime * result + unitprice;
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
		Category other = (Category) obj;
		if (itemcode != other.itemcode)
			return false;
		if (itemname == null) {
			if (other.itemname != null)
				return false;
		} else if (!itemname.equals(other.itemname))
			return false;
		if (quantity != other.quantity)
			return false;
		if (unitprice != other.unitprice)
			return false;
		return true;
	}
	public Category(int itemcode, String itemname, int quantity, int unitprice) {
		super();
		this.itemcode = itemcode;
		this.itemname = itemname;
		this.quantity = quantity;
		this.unitprice = unitprice;
	}
	@Override
	public String toString() {
		return "Category [itemcode=" + itemcode + ", itemname=" + itemname + ", quantity=" + quantity + ", unitprice="
				+ unitprice + "]";
	}
	

}
