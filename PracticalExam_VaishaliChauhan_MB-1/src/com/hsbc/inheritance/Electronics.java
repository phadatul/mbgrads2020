package com.hsbc.inheritance;

import java.time.Month;

import com.hsbc.model.Items;

public class Electronics extends Items {
	
	Month warranty;



	public Electronics(int item_code, String item_name, double unit_price, int quantity) {
		super(item_code, item_name, unit_price, quantity);
	}

	public Electronics(int item_code, String item_name, double unit_price, int quantity, Month warranty) {
		super(item_code, item_name, unit_price, quantity);
		this.warranty = warranty;
	}

	public Month getWarranty() {
		return warranty;
	}

	public void setWarranty(Month warranty) {
		this.warranty = warranty;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((warranty == null) ? 0 : warranty.hashCode());
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
		if (warranty != other.warranty)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Electronics [warranty=" + warranty + "]";
	}
	
	

}

