package com.hsbc.viewmain;

import com.hsbc.datamodel.Apparel;
import com.hsbc.datamodel.Category;
import com.hsbc.datamodel.FoodItems;
import com.hsbc.storage.Printingofdata;
import com.hsbc.storage.Sortingofdata;
import com.hsbc.storage.Storingofdata;
import com.hsbc.sorting.*;


public class Demo {
	public static void main(String[] args) {
		FoodItems f=new FoodItems(101,"Milk",2,28,"23-09-20","25-09-20","yes");
		FoodItems f1=new FoodItems(102,"Curd",40,4,"27-09-20","yes","22-09-20");
		FoodItems f2=new FoodItems(103,"Meat",500,10,"01-10-20","no","23-09-20");
		FoodItems f3=new FoodItems(104,"Fish",900,20,"01-10-20","no","23-09-20");
		Storingofdata<FoodItems> store=new Storingofdata<FoodItems>();
		store.addFoodRecord(f);
		store.addFoodRecord(f1);
		store.addFoodRecord(f2);
		store.addFoodRecord(f3);
		Printingofdata.printRecords(store.getFoodRecords());
		Sortingofdata.sortByQuantity(store.getFoodRecords());
		Printingofdata.printRecords(store.getFoodRecords());
		
		Apparel a=new Apparel(201,"T-Shirt",2,2800,1,"Cotton");
		Apparel a2=new Apparel(202,"Shirt",4,5800,2,"Medium");
		Storingofdata<Apparel> store1=new Storingofdata<Apparel>();
		store1.addApparelRecord(a);
		store1.addApparelRecord(a2);
		
		Printingofdata.printRecords(store1.getApparelRecords());
		Sortingofdata.sortByQuantity(store1.getApparelRecords());
		Printingofdata.printRecords(store1.getApparelRecords());
		
	}
}
