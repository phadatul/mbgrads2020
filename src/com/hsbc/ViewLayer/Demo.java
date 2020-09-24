package com.hsbc.ViewLayer;

import com.hsbc.BusinessLogicLayer.SortByQuantity;
import com.hsbc.BusinessLogicLayer.Storage;
import com.hsbc.DataAccessLayer.Apparel;
import com.hsbc.DataAccessLayer.Electronics;
import com.hsbc.DataAccessLayer.FoodItems;
import com.hsbc.DataAccessLayer.Product;
import java.util.Scanner;
public class Demo {
	
	/*
	 * Author:<Bhavik Dhodi>
	 * Purpose: < Displays Top3 products depending on quantitysold >
	 * 
	 * THe code doesn't Sort on basis of Category .It is left , SortByCategory class is EMpty
	 * 
	 */
		
	public static void main(String[] args) {
		
		Product newApparelItem1 = new Apparel(222, "T-shirt", 200, 100, "Large","Cotton",50);
		Product newApparelItem2 = new Apparel(432, "Shirt", 200, 100, "Medium","Cotton",32);
		Product newApparelItem3 = new Apparel(325, "Sweater", 200, 100, "Medium","Wollen",20);
		Product newApparelItem4 = new Apparel(201, "pant", 200, 100, "Full","Cotton",10);
		
		Product newfoodItem1 = new FoodItems(101,"Milk",80, 100, "12/12/2020", "12/12/2020", true,40);
		Product newfoodItem2 = new FoodItems(102,"Curd",40, 100, "12/12/2020", "12/12/2020", true,20);
		Product newfoodItem3 = new FoodItems(103,"Cake",300, 100, "12/12/2020", "12/12/2020", false,12);
		Product newfoodItem4 = new FoodItems(104,"Biscuits",20, 100, "12/12/2020", "12/12/2020", true,10);
		
		Product newELec1 = new Electronics(301,"TV",30000, 100,12,100);
		Product newELec2 = new Electronics(302,"Mobile",3000, 100,24,97);
		Product newELec3 = new Electronics(303,"Watch",300, 100,18,54);
		Product newELec4 = new Electronics(304,"Laptop",300000, 100,13,40);
		
		Storage store = new Storage();
		 store.addProduct(newApparelItem1);
		 store.addProduct(newApparelItem2);
		 store.addProduct(newApparelItem3);
		 store.addProduct(newApparelItem4);
		 store.addProduct(newELec1);
		 store.addProduct(newELec2);
		 store.addProduct(newELec3);	
		 store.addProduct(newELec4);
		 store.addProduct(newfoodItem1);
		 store.addProduct(newfoodItem2);
		 store.addProduct(newfoodItem3);
		 store.addProduct(newfoodItem4);

		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter Category of product:Food,Apparel,Electronics");
		String categoryInput = sc.nextLine();
		
		
		if(categoryInput.equals("Food")) {
			
			SortByQuantity.sortByQuantitySold(store.getProductDetails());
			System.out.println(store.getProductDetails());
			
		}else if(categoryInput.equals("Apparel")) {
			
			SortByQuantity.sortByQuantitySold(store.getProductDetails());
			System.out.println(store.getProductDetails());
			
		}else if(categoryInput.equals("Electronics")) {
			SortByQuantity.sortByQuantitySold(store.getProductDetails());
			System.out.println(store.getProductDetails());
			
		}else {
			System.out.println("Category does not exist");
		}
		
		
		Product p = new Product();
		
			
	}
}
