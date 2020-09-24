package com.hsbc.training.entityClasses;

/**
 * 
 * @author Neha Balasubramanian
 *
 * ENTITY CLASS.
 */

public class Apparel {
	
	private int itemCode;
	private String itemName;
	private int unitPrice;
	private int size;
	private String material;
	private int quantity;
		
	//CONSTRUCTORS
	public Apparel(int itemCode, String itemName, int unitPrice, int size, String material, int quantity) {
		super();
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.unitPrice = unitPrice;
		this.size = size;
		this.material = material;
		this.quantity = quantity;
	}
	
	

	public int getItemCode() {
		return itemCode;
	}



	public void setItemCode(int itemCode) {
		this.itemCode = itemCode;
	}



	public String getItemName() {
		return itemName;
	}



	public void setItemName(String itemName) {
		this.itemName = itemName;
	}



	public int getUnitPrice() {
		return unitPrice;
	}



	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
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



	public int getQuantity() {
		return quantity;
	}



	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}



	@Override
	public String toString() {
		return "Apparel [itemCode=" + itemCode + ", itemName=" + itemName + ", unitPrice=" + unitPrice + ", size="
				+ size + ", material=" + material + ", quantity=" + quantity + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + itemCode;
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
		if (itemCode != other.itemCode)
			return false;
		return true;
	}
	
	
	

}
