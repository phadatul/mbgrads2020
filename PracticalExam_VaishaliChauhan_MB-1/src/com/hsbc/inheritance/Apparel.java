package com.hsbc.inheritance;

import com.hsbc.model.Items;

public class Apparel extends Items {
	

	int size;
	String material;
	
	


	public Apparel(int item_code, String item_name, double unit_price, int quantity) {
		super(item_code, item_name, unit_price, quantity);
	}


	public Apparel(int item_code, String item_name, double unit_price, int quantity, int size, String material) {
		super(item_code, item_name, unit_price, quantity);
		this.size = size;
		this.material = material;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((material == null) ? 0 : material.hashCode());
		result = prime * result + size;
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
		Apparel other = (Apparel) obj;
		if (material == null) {
			if (other.material != null)
				return false;
		} else if (!material.equals(other.material))
			return false;
		if (size != other.size)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Apparel [size=" + size + ", material=" + material + "]";
	}


	public int getSize() {
		return size;
	}


	public void setSize(int size) {
		this.size = size;
	}


	public String getMaterial() {
		return material;
	}


	public void setMaterial(String material) {
		this.material = material;
	}
	
	
	

}
