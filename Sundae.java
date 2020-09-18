package com.hsbc.ecommerce.model;

public class Sundae extends IceCream {

	double cost_topping;

	public Sundae() {
		// TODO Auto-generated constructor stub
	}

	public Sundae(String name) {
		super(name);
		this.cost_topping = 10;
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return super.getCost() + this.cost_topping;
	}

}
