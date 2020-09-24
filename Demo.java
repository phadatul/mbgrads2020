package com.hsbc.view;

import com.hsbc.dao.DataAccess;
import com.hsbc.logic.DisplayItems;
import com.hsbc.logic.SortItems;
import com.hsbc.model.Apparel;
import com.hsbc.model.Electronics;
import com.hsbc.model.FoodItem;

/*
 * @author: Sukriti Shukla
 * purpose: to run the program and print results
 */

public class Demo {
	
	public static void main(String[] args) {
		
		DataAccess<FoodItem> foodItem=new DataAccess<FoodItem>();
		
		//adding food items
		foodItem.addRecords(new FoodItem(101, "Milk", 40,"23/09/2019","23/09/2020", "yes", 10));
		foodItem.addRecords(new FoodItem(102, "Coffee", 100,"23/09/2019","23/09/2020", "yes", 5));
		foodItem.addRecords(new FoodItem(103, "Eggs", 10,"23/09/2019","23/09/2020", "no", 20));
		foodItem.addRecords(new FoodItem(104, "Vegetable", 20,"23/09/2019","23/09/2020", "yes", 15));
		foodItem.addRecords(new FoodItem(105, "Cake", 200,"23/09/2019","23/09/2020", "no", 2));
		
		//adding apparel items
		DataAccess<Apparel> apparelItem=new DataAccess<Apparel>();
		apparelItem.addRecords(new Apparel(201, "T-Shirt", 400,"Small","cotton", 5));
		apparelItem.addRecords(new Apparel(202, "Shirt", 500,"medium","cotton", 4));
		apparelItem.addRecords(new Apparel(203, "Shorts", 300,"Small","wollen", 7));
		apparelItem.addRecords(new Apparel(204, "Pants", 400,"large","cotton", 3));
		apparelItem.addRecords(new Apparel(205, "Sweater", 400,"large","wollen", 2));
		
		
		//adding electronic items
		DataAccess<Electronics> electronicItem=new DataAccess<Electronics>();
		electronicItem.addRecords(new Electronics(1013, "TV", 3000,12, 50));
		electronicItem.addRecords(new Electronics(1026, "Mobile", 5000,24, 14));
		electronicItem.addRecords(new Electronics(1114, "Watch", 3200,18, 27));
		electronicItem.addRecords(new Electronics(1245, "Charger", 400,12, 36));
		electronicItem.addRecords(new Electronics(1265, "headPhone", 1400,18, 12));
		
		//displaying required results
		SortItems.sortFoodByQuantity(foodItem.getRecords());
		System.out.println("FOOD ITEMS");
		DisplayItems.printItems(foodItem.getRecords());
		
		SortItems.sortApparelByQuantity(apparelItem.getRecords());
		System.out.println("APPAREL");
		DisplayItems.printItems(apparelItem.getRecords());
		
		SortItems.sortElectronicsByQuantity(electronicItem.getRecords());
		System.out.println("Electronics");
		DisplayItems.printItems(electronicItem.getRecords());
		
	}

}
