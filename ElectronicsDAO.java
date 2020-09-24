/*
 * Author: Riya Puri
 * Purpose: This program is a standard template for defining functionalities related to Electronics
 * with 2 abstract methods used to add items and retrieve all food items
 */

package com.hsbc.utilities;

import java.util.List;

import com.hsbc.model.Electronics;


public interface ElectronicsDAO {
	public void insertFoodItem(Electronics b);
	   public List<Electronics> getAllFoodItems();
}
