package com.hsbc.inheritance;

import java.util.Date;

import com.hsbc.model.Items;

public class FoodItems extends Items {
	
	Date date_of_manufacture;
	Date date_of_expiry;
	Boolean Vegetarian;
	
	
	
	public FoodItems(int item_code, String item_name, double unit_price, int quantity) {
		super(item_code, item_name, unit_price, quantity);
	}

	public FoodItems(int item_code, String item_name, double unit_price, int quantity, Date date_of_manufacture,
			Date date_of_expiry, Boolean vegetarian) {
		super(item_code, item_name, unit_price, quantity);
		this.date_of_manufacture = date_of_manufacture;
		this.date_of_expiry = date_of_expiry;
		Vegetarian = vegetarian;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Vegetarian == null) ? 0 : Vegetarian.hashCode());
		result = prime * result + ((date_of_expiry == null) ? 0 : date_of_expiry.hashCode());
		result = prime * result + ((date_of_manufacture == null) ? 0 : date_of_manufacture.hashCode());
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
		FoodItems other = (FoodItems) obj;
		if (Vegetarian == null) {
			if (other.Vegetarian != null)
				return false;
		} else if (!Vegetarian.equals(other.Vegetarian))
			return false;
		if (date_of_expiry == null) {
			if (other.date_of_expiry != null)
				return false;
		} else if (!date_of_expiry.equals(other.date_of_expiry))
			return false;
		if (date_of_manufacture == null) {
			if (other.date_of_manufacture != null)
				return false;
		} else if (!date_of_manufacture.equals(other.date_of_manufacture))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "FoodItems [date_of_manufacture=" + date_of_manufacture + ", date_of_expiry=" + date_of_expiry
				+ ", Vegetarian=" + Vegetarian + "]";
	}

	
		
	}
	
	
	
	
}
