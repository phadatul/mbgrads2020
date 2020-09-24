package com.hsbc.mb1.service;

import java.util.Collection;

import com.hsbc.mb1.model.*;

public interface ItemService {
	public Apparel createApparel(String itemName, int itemCode, int itemQuantity, double itemPrice, String size,String material);
	public Electronics createElectronics(String itemName, int itemCode, int itemQuantity, double itemPrice, int warranty);
	public FoodItems creatFoodItems(String itemName, int itemCode, int itemQuantity, double itemPrice, int dateManfacturingMonth, int dateManfacturingYear, int dateExpiryMonth, Boolean Vegitarian);
	
	public Collection<Apparel> fetchAllApparels();
	public Collection<Electronics> Electronics();
	public Collection<FoodItems> FoodItems();

}
