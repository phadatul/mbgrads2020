package com.everyday.datastorage;

public class Apparel extends Items {
	
	

	public String size;
	public String material;
	
	public Apparel() {
		
	}

	public Apparel(int itemCode, String itemName, int unitPrice,int quantity,String size, String material) {
		super(itemCode,itemName,unitPrice,quantity);
		this.size = size;
		this.material = material;
	}
	

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((material == null) ? 0 : material.hashCode());
		result = prime * result + ((size == null) ? 0 : size.hashCode());
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
		if (size == null) {
			if (other.size != null)
				return false;
		} else if (!size.equals(other.size))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Apparel [size=" + size + ", material=" + material + ", itemCode=" + itemCode + ", itemName=" + itemName
				+ ", unitPrice=" + unitPrice + ", quantity=" + quantity + "]";
	}
	
	
	

}
