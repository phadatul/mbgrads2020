package com.hsbc.Entities;

/*
 * @author Deepanshu Sharma
 * This class contains the blueprint for items of the type FoodItems
 */
public class FoodItems extends Items {

	String dateofmanufacture;
	String dateofexpiry;
	String veg;

	public FoodItems(int code, String name, double price, int quantity, String dateofmanufacture, String dateofexpiry,String veg) {
		super(code, name, price, quantity);
		// TODO Auto-generated constructor stub
		this.dateofmanufacture = dateofmanufacture;
		this.dateofexpiry = dateofexpiry;
		this.veg=veg;
	}

	public FoodItems() {
		// TODO Auto-generated constructor stub
	}

}
