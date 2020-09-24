/*
 * Author: Riya Puri
 * Purpose: This program is a standard template for defining functionalities related to FoodItems
 * with 2 abstract methods used to add items and retrieve all food items
 */


package com.hsbc.utilities;

import java.util.List;

import com.hsbc.model.FoodItems;

public interface FoodItemsDAO {
   public void insertFoodItem(FoodItems b);
   public List<FoodItems> getAllFoodItems();
	
}
