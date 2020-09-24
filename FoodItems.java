package com.hsbc.datamodel;

public class FoodItems extends Category
{
	
	String fooddom;
	String fooddoe;
	String  foodveg;
	


	public FoodItems(int itemcode, String itemname, int quantity, int unitprice, String fooddom, String fooddoe,
			String foodveg) {
		super(itemcode, itemname, quantity, unitprice);
		this.fooddom = fooddom;
		this.fooddoe = fooddoe;
		this.foodveg = foodveg;
	}





	





	@Override
	public String toString() {
		return "FoodItems [  itemcode="
				+ itemcode + ", itemname=" + itemname + ", quantity=" + quantity + ", unitprice=" + unitprice + ",foodveg=" + foodveg+" ]";
	}











	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((fooddoe == null) ? 0 : fooddoe.hashCode());
		result = prime * result + ((fooddom == null) ? 0 : fooddom.hashCode());
		result = prime * result + ((foodveg == null) ? 0 : foodveg.hashCode());
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
		FoodItems other = (FoodItems) obj;
		if (fooddoe == null) {
			if (other.fooddoe != null)
				return false;
		} else if (!fooddoe.equals(other.fooddoe))
			return false;
		if (fooddom == null) {
			if (other.fooddom != null)
				return false;
		} else if (!fooddom.equals(other.fooddom))
			return false;
		if (foodveg == null) {
			if (other.foodveg != null)
				return false;
		} else if (!foodveg.equals(other.foodveg))
			return false;
		return true;
	}



	
}
