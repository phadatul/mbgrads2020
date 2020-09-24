package com.practical.entity;
/**
 * 
 * @author Swarga Sarkar
 * @purpose This class conatains Apparels and is derived from Products
 *
 */

public class Apparel extends Products{
	
	private String size, material;
	public Apparel() {
		// TODO Auto-generated constructor stub
	}
	public Apparel(int itemCode, String itemName, double unit_price, int quantity, String size, String material) {
		super(itemCode, itemName, unit_price, quantity);
		// TODO Auto-generated constructor stub
		this.size=size;
		this.material=material;
	}
	// overiding toString() method
	@Override
	public String toString() {
		return "Apparel [size=" + size + ", material=" + material + "]";
	}
	

}
