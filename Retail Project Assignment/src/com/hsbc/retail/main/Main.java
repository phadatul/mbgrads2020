package com.hsbc.retail.main;

import com.hsbc.retail.exceptions.*;
import com.hsbc.retail.productstructure.Apparel;
import com.hsbc.retail.productstructure.FoodItems;
import com.hsbc.retail.utility.SortProducts;
import com.hsbc.retail.utility.StoreProducts;

public class Main {
	public static void main(String[] args) {
		FoodItems fi1 = new FoodItems(101, "Milk", 25, 40, "20 Sep 2020", "30 Sep 2020", "Yes");
		FoodItems fi2 = new FoodItems(102, "Curd", 100, 20, "18 Sep 2020", "1 Oct 2020", "Yes");
		FoodItems fi3 = new FoodItems(103, "Cake", 300, 12, "1 Sep 2020", "30 Dec 2020", "No");
		StoreProducts<FoodItems> sp1 = new StoreProducts<FoodItems>();
		try {
			sp1.addProduct(fi1);
			sp1.addProduct(fi2);
			sp1.addProduct(fi3);
		} catch (AddItemException e) {
			e.printStackTrace();
		}
		Apparel a1 = new Apparel(222, "T-Shirt", 300, 50, "Large", 6, "Cotton");
		Apparel a2 = new Apparel(432, "Shirt", 400, 32, "Medium", 6, "Cotton");
		Apparel a3 = new Apparel(325, "Sweater", 500, 20, "Medium", 6, "Woolen");
		StoreProducts<Apparel> sp2 = new StoreProducts<Apparel>();
		try {
			sp2.addProduct(a1);
			sp2.addProduct(a2);
			sp2.addProduct(a3);
		} catch (AddItemException e) {
			e.printStackTrace();
		}
		SortProducts.sortByQuantity(sp1.getProducts());
		SortProducts.sortByQuantity(sp2.getProducts());
		try {
			sp1.getReport();
			sp2.getReport();
		} catch (CategoryNotPresentException e) {
			e.printStackTrace();
		}
	}
}
