package com.hsbc.view;

import com.hsbc.buisness.ProductsDaoImpl;
import com.hsbc.entity.Apparel;
import com.hsbc.entity.FoodItems;
import com.hsbc.entity.Products;
/**
 * 
 * 
 * @author Siddhant
 * 
 *@purpose This is the main method 
 */

public class demo {
	
	public static void main(String[] args) {
		
		Products product =new Products();
		
		ProductsDaoImpl products =new ProductsDaoImpl(); //creating object of Dao implemented class
		FoodItems fooditem1= new FoodItems(101,"milk",20,40,2020,2022,"yes"); //creating the object of Food item class 
	 
		products.addFoodItems(fooditem1);
		System.out.println(products.getFoodItems());
		
		Apparel apparel1 =new Apparel(201,"Sweater",300,5,"Cotton");
		products.addApparel(apparel1);
		System.out.println(products.getApparel());
		
		
		
		
		
	}



}
