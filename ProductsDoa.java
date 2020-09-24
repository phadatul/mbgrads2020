package com.hsbc.dao;

import java.util.List;

import com.hsbc.entity.*;
 /**
  * 
  * @author Siddhant
  * @purpose Data access layer contains methods to be implemented by the class which implements it 
  */
public interface ProductsDoa {

	public void addFoodItems(FoodItems fooditems); // adding food items

	public void addApparel(Apparel apparel); //adding apparel

	public void addElectronics(Electronics electronics); //adding electronics

	public List<FoodItems> getFoodItems(); //retrieving the data

	public List<Apparel> getApparel();

	public List<Electronics> getElectronics();

}
