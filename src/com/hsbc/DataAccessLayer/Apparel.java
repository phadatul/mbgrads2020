package com.hsbc.DataAccessLayer;

public class Apparel extends Product {

	private String size;
	private String material;

	public Apparel() {
		super();
	}

	public Apparel(int itemCode, String itemName, double unitPrice, int quantity, String size, String material,
			int quantitySold) {
		super();
		super.setItemCode(itemCode);
		super.setItemName(itemName);
		super.setUnitPrice(unitPrice);
		super.setQuantity(quantity);
		super.setQuantitySold(quantitySold);
		super.setCategoryType("Apparel");
		this.size = size;
		this.material = material;
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

	@Override
	public String toString() {
		return "Apparel [size=" + size + ", material=" + material + "]";
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

}
