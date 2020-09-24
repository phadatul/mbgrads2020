package com.hsbc.ViewLayer;
import com.hsbc.Entities.*;
import com.hsbc.DataAccessLayer.*;

/*
 * @author Deepanshu Sharma
 * Test class is used to drive the program
 */
public class Test {
	public static void main(String[] args) {
		/*
		 * creating object for food items
		 */
		FoodItems f1 = new FoodItems(101,"Milk",50,40, "27/06/2020", "27/06/2021","Veg");
		FoodItems f2 = new FoodItems(102,"Curd",20,30, "07/10/2020", "31/12/2020","Veg");
		FoodItems f3 = new FoodItems(111,"Cake",200,10, "03/09/2020", "11/01/2021","Non-Veg");
		
		/*
		 * inserting food item objects in file
		 */
		FoodAccess fa = new FoodAccess();
		fa.insertFoodItem(f1);
		fa.insertFoodItem(f2);
		fa.insertFoodItem(f3);
		
		/*
		 * creating apparel objects
		 */
		Apparel a1 = new Apparel(222, "T shirt", 500,50,"Large","Cotton");
		Apparel a2 = new Apparel(432, "Shirt", 700,30,"Medium","Cotton");
		Apparel a3 = new Apparel(325, "Sweater", 650,20,"Medium","Cotton");
		/*
		 * inserting apparel objects in file
		 */
		ApparelAccess aa = new ApparelAccess();
		aa.insertApparel(a1);
		aa.insertApparel(a2);
		aa.insertApparel(a3);
		
		/*
		 * creating electronic object items
		 */
		Electronics e1 = new Electronics(1013, "TV",4000,100,12);
		Electronics e2 = new Electronics(1026, "Mobile",2000,90,24);
		Electronics e3 = new Electronics(1114, "Watch",800,54,18);
		
		/*
		 * inserting electronic objects in file
		 */
		ElectronicsAccess ea = new ElectronicsAccess();
		ea.insertElectronic(e1);
		ea.insertElectronic(e2);
		ea.insertElectronic(e3);
		
		FoodItems f4 = new FoodItems();
		f4 = fa.retrieveFoodItem();
		System.out.println(f4);
		
		Apparel a4 = new Apparel();
		a4=aa.retrieveApparel();
		System.out.println(a4);
		
		Electronics e4 = new Electronics();
		e4=ea.retrieveElectronic();
		System.out.println(e4);
	}
}
