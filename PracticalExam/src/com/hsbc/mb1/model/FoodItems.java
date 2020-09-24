package com.hsbc.mb1.model;

public class FoodItems extends Items{
	
	private int dateManfacturingMonth;
	private int dateManfacturingYear;
	
	private int dateExpiryMonth;
	private int dateExpiryYear;
	
	Boolean Vegitarian;
	
	public FoodItems(String itemName, int itemCode, int itemQuantity, double itemPrice, int dateManfacturingMonth, int dateManfacturingYear, int dateExpiryMonth, Boolean Vegitarian){
		super(itemName, itemCode, itemQuantity,itemPrice);
		this.dateManfacturingMonth=dateManfacturingMonth;
		this.dateManfacturingYear=dateManfacturingYear;
		this.dateExpiryMonth=dateExpiryMonth;
		this.dateExpiryYear=dateExpiryYear;
	}

}
