package com.everyDayGoodProducts.viewLayer;

import com.everyDayGoodProducts.bussinessLogicForReport.sortByQuantity;
import com.everyDayGoodProducts.model.Apparel;
import com.everyDayGoodProducts.model.Electronics;
import com.everyDayGoodProducts.model.FoodItems;
import com.everyDayGoodProducts.printUtil.PrintUtil;
import com.everyDayGoodProducts.storeUtil.StoreUtil;

/**
 * Main Class to create items and Display the report for TOP 3 items of each type
 * 
 * @author lenovo
 *
 */
public class Main {
	public static void main(String[] args) {
		FoodItems f1 = new FoodItems(101, "MILK", 50, "10/12/2019", "13/12/2019", true, 3);
		FoodItems f2 = new FoodItems(102, "BUTTER", 40, "10/12/2019", "13/12/2019", true, 2);
		FoodItems f3 = new FoodItems(103, "CHEEZE", 30, "10/12/2019", "13/12/2019", true, 2);
		FoodItems f4 = new FoodItems(104, "CURD", 60, "10/12/2019", "13/12/2019", true, 6);
		FoodItems f5 = new FoodItems(105, "CAKE", 90, "10/12/2019", "13/12/2019", false, 5);

		StoreUtil<FoodItems> storeFood = new StoreUtil<>();
		storeFood.addItem(f1);
		storeFood.addItem(f2);
		storeFood.addItem(f3);
		storeFood.addItem(f4);
		storeFood.addItem(f5);

		Electronics e1 = new Electronics(201, "WATCH", 1000, 2, 10);
		Electronics e2 = new Electronics(202, "TV", 1000, 4, 20);
		Electronics e3 = new Electronics(203, "MOBILE", 1000, 1, 100);
		Electronics e4 = new Electronics(204, "OVEN", 1000, 5, 15);

		StoreUtil<Electronics> storeElectronics = new StoreUtil<>();
		storeElectronics.addItem(e1);
		storeElectronics.addItem(e2);
		storeElectronics.addItem(e3);
		storeElectronics.addItem(e4);

		Apparel a1 = new Apparel(301, "SHIRT", 200, 32, "Cotton", 30);
		Apparel a2 = new Apparel(302, "SHORTS", 100, 34, "Woolen", 60);
		Apparel a3 = new Apparel(303, "JEANS", 600, 34, "Cotton", 90);
		Apparel a4 = new Apparel(304, "HOODIE", 900, 8, "Woolen", 20);

		StoreUtil<Apparel> storeApparel = new StoreUtil<Apparel>();
		storeApparel.addItem(a1);
		storeApparel.addItem(a2);
		storeApparel.addItem(a3);
		storeApparel.addItem(a4);

		sortByQuantity.sortByQuantity(storeFood.getItems());
		PrintUtil.printItems(storeFood.getItems());

		System.out.println("-------------------------------------------------------------");

		sortByQuantity.sortApparelByQuantity(storeApparel.getItems());
		PrintUtil.printItems(storeApparel.getItems());

		System.out.println("-------------------------------------------------------------");

		sortByQuantity.sortElelctronicsByQuantity(storeElectronics.getItems());
		PrintUtil.printItems(storeElectronics.getItems());
	}

}
