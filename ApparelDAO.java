/*
 * Author: Riya Puri
 * Purpose: This program is a standard template for defining functionalities related to Apparels
 * with 2 abstract methods used to add items and retrieve all food items
 */

package com.hsbc.utilities;

import java.util.List;

import com.hsbc.model.Apparel;


public interface ApparelDAO {
	
	public void insertFoodItem(Apparel b);
	   public List<Apparel> getAllFoodItems();

}
