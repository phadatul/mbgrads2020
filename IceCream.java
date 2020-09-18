package com.hsbc.ecommerce.model;

public class IceCream extends DessertItem {

	double cost_of_icecream;

	public IceCream() {
		// TODO Auto-generated constructor stub
	}

	public IceCream(String name) {
		super(name);
		// TODO Auto-generated constructor stub
		this.cost_of_icecream = 50;
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return this.cost_of_icecream;
	}

}
