package com.hsbc.model;

public class Items {

	int item_code;
	String item_name;
	double unit_price;
	int Quantity;
	public Items(int item_code, String item_name, double unit_price, int quantity) {
		super();
		this.item_code = item_code;
		this.item_name = item_name;
		this.unit_price = unit_price;
		Quantity = quantity;
	}
	public int getItem_code() {
		return item_code;
	}
	public void setItem_code(int item_code) {
		this.item_code = item_code;
	}
	public String getItem_name() {
		return item_name;
	}
	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}
	public double getUnit_price() {
		return unit_price;
	}
	public void setUnit_price(double unit_price) {
		this.unit_price = unit_price;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Quantity;
		result = prime * result + item_code;
		result = prime * result + ((item_name == null) ? 0 : item_name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(unit_price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Items other = (Items) obj;
		if (Quantity != other.Quantity)
			return false;
		if (item_code != other.item_code)
			return false;
		if (item_name == null) {
			if (other.item_name != null)
				return false;
		} else if (!item_name.equals(other.item_name))
			return false;
		if (Double.doubleToLongBits(unit_price) != Double.doubleToLongBits(other.unit_price))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Items [item_code=" + item_code + ", item_name=" + item_name + ", unit_price=" + unit_price
				+ ", Quantity=" + Quantity + "]";
	}
	
	
}
