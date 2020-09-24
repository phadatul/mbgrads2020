package com.hsbc.Entities;

/*
 * @author Deepanshu Sharma
 * This class contains the blueprint for items of the type Apparel
 */
public class Apparel extends Items {
	String size;
	String material;

	public Apparel(int code, String name, double price, int quantity, String size, String material) {
		super(code, name, price, quantity);
		// TODO Auto-generated constructor stub
		this.size = size;
		this.material = material;
	}

	public Apparel() {
		
	}
	

}
