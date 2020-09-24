package com.everyday.viewlayer;

import com.everyday.businesslogic.BusinessLogic;
import com.everyday.datastorage.FoodItems;
import com.everyday.datastorage.Items;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FoodItems f= new FoodItems(101,"milk",40,"17","19",10,"yes");
		FoodItems f1= new FoodItems(102,"milk",40,"17","19",80,"yes");
		FoodItems f2= new FoodItems(103,"milk",40,"17","19",46,"yes");
		FoodItems f3= new FoodItems(104,"milk",40,"17","19",50,"yes");
		
		BusinessLogic<FoodItems > store = new BusinessLogic<FoodItems >();
		store.addItems(f);
		store.addItems(f1);
		store.addItems(f2);
		store.addItems(f3);
		
		System.out.println(store.getItems());
		
		
		

		
		
		

	}

}
