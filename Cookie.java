package com.hsbc.ecommerce.model;

public class Cookie extends DessertItem {

	int numberofItems;
	double price_dozen;

	public Cookie() {
		// TODO Auto-generated constructor stub
	}

	public Cookie(String name, int numerofItems) {
		super(name);
		this.numberofItems = numerofItems;
		this.price_dozen = 120;

	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return this.numberofItems * (10);
	}

}
