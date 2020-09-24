package com.practical.entity;
/**
 * 
 * @author Swarga Sarkar
 * @purpose This class conatains Electronics and is derived from Products
 *
 */

public class Electronics extends Products {

	private int warranty_in_months;
	public Electronics() {
		// TODO Auto-generated constructor stub
	}
	public Electronics(int itemCode, String itemName, double unit_price, int quantity, int warranty_in_months) {
		super(itemCode, itemName, unit_price, quantity);
		// TODO Auto-generated constructor stub
		this.warranty_in_months=warranty_in_months;
	}
	//Overriding toString()
	@Override
	public String toString() {
		return "Electronics [warranty_in_months=" + warranty_in_months + "]";
	}
	
}
