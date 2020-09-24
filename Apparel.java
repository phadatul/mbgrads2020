package com.hsbc.datamodel;

public class Apparel extends Category{
	
	int apparelsize;
	String material;
	public Apparel(int itemcode, String itemname, int quantity, int unitprice, int apparelsize, String material) {
		super(itemcode, itemname, quantity, unitprice);
		this.apparelsize = apparelsize;
		this.material = material;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + apparelsize;
		result = prime * result + ((material == null) ? 0 : material.hashCode());
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
		if (apparelsize != other.apparelsize)
			return false;
		if (material == null) {
			if (other.material != null)
				return false;
		} else if (!material.equals(other.material))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Apparel [ itemcode=" + itemcode
				+ ", itemname=" + itemname + ", quantity=" + quantity + ", unitprice=" + unitprice + "]";
	}
	
	
	
}
