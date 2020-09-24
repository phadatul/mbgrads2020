package com.hsbc.ui;

import java.util.ArrayList;
import java.util.List;

import com.hsbc.businesslogic.BusinessLogic;
import com.hsbc.entityclasses.Apparel;
import com.hsbc.entityclasses.Electronic;
import com.hsbc.entityclasses.FoodItem;
import com.hsbc.entityclasses.Product;

/**
 * This class is the entry point of the system(UI).
 * 
 * @author Jayprakash Chawla
 *
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BusinessLogic bfi = new BusinessLogic();
		BusinessLogic bfa = new BusinessLogic();
		BusinessLogic bfe = new BusinessLogic();

		bfi.addNewItem(new FoodItem(101, "Milk", 10, 40, "01-01-2020", "01-03-2020", 1));
		bfi.addNewItem(new FoodItem(102, "Curd", 20, 20, "11-01-2020", "01-02-2020", 1));
		bfi.addNewItem(new FoodItem(111, "Cake", 30, 12, "31-01-2020", "01-02-2020", 1));

		bfa.addNewItem(new Apparel(222, "T-shirt", 300, 50, "Large", "Cotton"));
		bfa.addNewItem(new Apparel(432, "Shirt", 400, 32, "Medium", "Cotton"));
		bfa.addNewItem(new Apparel(325, "Sweater", 500, 20, "Medium", "Woolen"));

		bfe.addNewItem(new Electronic(1013, "TV", 1400, 100, 12));
		bfe.addNewItem(new Electronic(1026, "Mobile", 1200, 97, 24));
		bfe.addNewItem(new Electronic(1114, "Watch", 1300, 54, 18));

		System.out.println(bfi.generateReport());
		System.out.println(bfa.generateReport());
		System.out.println(bfe.generateReport());

	}

}
