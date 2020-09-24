package com.practical.entity;

/**
 * 
 * @author Swarga Sarkar
 * @purpose This class represents the food items and is derived from Products class
 *
 */
public class FoodItems extends Products {

	private String date_of_manufacture, date_of_expiry, vegetarian;
	public FoodItems() {
		// TODO Auto-generated constructor stub
	}
	public FoodItems(int itemCode, String itemName, double unit_price, int quantity, String dom, String doe, String vegetarian) {
		super(itemCode, itemName, unit_price, quantity);
		// TODO Auto-generated constructor stub
		this.date_of_manufacture=dom;
		this.date_of_expiry=doe;
		this.vegetarian=vegetarian;
		
	}
	// overiding toString() method
	@Override
	public String toString() {
		return "FoodItems [vegetarian=" + vegetarian + "]";
	}
	
	
}
