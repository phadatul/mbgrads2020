package com.hsbc.ecommerce.model;

public abstract class DessertItem {

	private String name;

	public DessertItem() {
		// TODO Auto-generated constructor stub
	}

	public DessertItem(String name) {
		this.name = name;
	}

	public abstract double getCost();

	public final String getName() {
		return this.name;
	}

}
