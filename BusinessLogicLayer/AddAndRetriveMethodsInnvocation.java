package com.practical.BusinessLogicLayer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.practical.DataAccessLayer.DataAccessMethods;
import com.practical.EntityClasses.*;

public class AddAndRetriveMethodsInnvocation {
	
	/**
	 * This function gives top 3 food items by quantity
	 * @author Mohit Khandelwal
	 */
	public void retriveFood() {
		FoodItems foodItem1 = new FoodItems(101,"Dairy Milk",10,"12/01/2020","12/01/20201","Yes",100);
		FoodItems foodItem2 = new FoodItems(102,"KitKat",20,"12/01/2020","12/01/20201","Yes",70);
		FoodItems foodItem3 = new FoodItems(103,"Dairy Milk Silk",100,"01/02/2020","01/02/20201","Yes",10);
		FoodItems foodItem4 = new FoodItems(104,"Five Star",15,"02/01/2020","02/01/20201","Yes",50);
		FoodItems foodItem5 = new FoodItems(105,"Munch",5,"06/01/2020","06/01/20201","Yes",90);
		
		DataAccessMethods<FoodItems> foodItemData = new DataAccessMethods<FoodItems>();
		foodItemData.addNewData(foodItem1);
		foodItemData.addNewData(foodItem2);
		foodItemData.addNewData(foodItem3);
		foodItemData.addNewData(foodItem4);
		foodItemData.addNewData(foodItem5);
		
		ArrayList<FoodItems> a1 = new ArrayList<>();
		SortFoodByQuantity sf = new SortFoodByQuantity();
		//DataAccessMethods<FoodItems> foodItemData = new DataAccessMethods<FoodItems>();
		a1 = foodItemData.retriveReport();
		Collections.sort(a1,sf);
		//System.out.println(a1);
		
		for(int i=0;i<3;i++){
			System.out.println(a1.get(i));
			
		}
		
		
		
		/**
		 * This function gives top 3 apparel items by quantity
		 */

	}
	public void retriveApparel() {
		Apparel apparelItem1 = new Apparel(201, "Sweat Shirt", 4000, 38, "Wool", 20);
		Apparel apparelItem2 = new Apparel(202, "T Shirt", 500, 38, "Linen", 50);
		Apparel apparelItem3 = new Apparel(203, "Shirt", 1000, 38, "Linen", 45);
		Apparel apparelItem4 = new Apparel(204, "Trousers", 2500, 32, "Cotton", 30);
		Apparel apparelItem5 = new Apparel(204, "Blazers", 7000, 40, "Cotton", 15);
		
		DataAccessMethods<Apparel> apparelItemData = new DataAccessMethods<>();
		apparelItemData.addNewData(apparelItem1);
		apparelItemData.addNewData(apparelItem2);
		apparelItemData.addNewData(apparelItem3);
		apparelItemData.addNewData(apparelItem4);
		apparelItemData.addNewData(apparelItem5);
		
		ArrayList<Apparel> a2 = new ArrayList<>();
		SortApparelByQuantity sa = new SortApparelByQuantity();
		//DataAccessMethods<Apparel> apparelItemData = new DataAccessMethods<>();
		a2 = apparelItemData.retriveReport();
		Collections.sort(a2,sa);
		//System.out.println(a2);
		for(int i=0;i<3;i++){
			System.out.println(a2.get(i));
			
		}	
		

	}
	
	/**
	 * This function gives top 3 electronics items by quantity
	 */
	public void retriveElectronics() {
		Electronics electronicItem1 = new Electronics(301,"TV",10000,12,15);
		Electronics electronicItem2 = new Electronics(301,"LED",50000,15,20);
		Electronics electronicItem3 = new Electronics(301,"Speakers",5000,6,50);
		Electronics electronicItem4 = new Electronics(301,"Mobile",50000,12,30);
		Electronics electronicItem5 = new Electronics(301,"Watch",50000,3,5);	
		
		DataAccessMethods<Electronics> electronicsItemData = new DataAccessMethods<>();
		electronicsItemData.addNewData(electronicItem1);
		electronicsItemData.addNewData(electronicItem2);
		electronicsItemData.addNewData(electronicItem3);
		electronicsItemData.addNewData(electronicItem4);
		electronicsItemData.addNewData(electronicItem5);
		
	ArrayList<Electronics> a3 = new ArrayList<>();
		SortElectronicsByQuantity se = new SortElectronicsByQuantity();
		//DataAccessMethods<Electronics> electronicsItemData = new DataAccessMethods<>();
		a3=electronicsItemData.retriveReport();
		Collections.sort(a3,se);
		//System.out.println(a3);
		for(int i=0;i<3;i++){
			System.out.println(a3.get(i));
			
		}
		
	

	}
	
	
	
	

}
