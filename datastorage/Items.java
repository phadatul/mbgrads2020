package com.everyday.datastorage;

public class Items  {
	public int itemCode;
	public String itemName;
	public int unitPrice;
	public int quantity;
	
	public Items() {
		
	}
	
	
	

	public Items(int itemCode, String itemName, int unitPrice,int quantity ) {
		super();
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.unitPrice = unitPrice;
		this.quantity=quantity;
	}
	
	


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + itemCode;
		result = prime * result + ((itemName == null) ? 0 : itemName.hashCode());
		result = prime * result + quantity;
		result = prime * result + unitPrice;
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
		if (itemCode != other.itemCode)
			return false;
		if (itemName == null) {
			if (other.itemName != null)
				return false;
		} else if (!itemName.equals(other.itemName))
			return false;
		if (quantity != other.quantity)
			return false;
		if (unitPrice != other.unitPrice)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Items [itemCode=" + itemCode + ", itemName=" + itemName + ", unitPrice=" + unitPrice + ", quantity="
				+ quantity + "]";
	}

	
	

}
