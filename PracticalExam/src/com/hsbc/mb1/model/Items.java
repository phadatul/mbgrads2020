package com.hsbc.mb1.model;

public class Items {
	private String itemname;
	private int itemCode;
	private int itemQuantity;
	private double itemprice;
	
	public Items(String itemName, int itemCode, int itemQuantity, double itemprice) {
		this.itemCode=itemCode;
		this.itemname=itemName;
		this.itemQuantity=itemQuantity;
		this.itemprice=itemprice;
	}

	public String getItemname() {
		return itemname;
	}

	public void setItemname(String itemname) {
		this.itemname = itemname;
	}

	public int getItemCode() {
		return itemCode;
	}

	public void setItemCode(int itemCode) {
		this.itemCode = itemCode;
	}

	public int getItemQuantity() {
		return itemQuantity;
	}

	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}
	

}
