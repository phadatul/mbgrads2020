package com.hsbc.buisness;

import java.util.ArrayList;
import java.util.List;

import com.hsbc.dao.ProductsDoa;
import com.hsbc.entity.*;
/**
 * 
 * @author Siddhant
 *@purpose This is class implements the doa interface and overrides all the method
 */
public class ProductsDaoImpl implements ProductsDoa {

	ArrayList<FoodItems> foodItemList;  //Using java Arraylist from javacollection to create food item list

	ArrayList<Apparel> apparelList;
	ArrayList<Electronics> electronicsList;

	public ProductsDaoImpl() {												//overriding doa method
		// TODO Auto-generated constructor stub
		this.foodItemList = new ArrayList<FoodItems>();
		this.apparelList = new ArrayList<Apparel>();
		this.electronicsList = new ArrayList<Electronics>();
	}

	public void addFoodItems(FoodItems fooditems) {
		// TODO Auto-generated method stub
		foodItemList.add(fooditems);

	}

	public void addApparel(Apparel apparel) {
		// TODO Auto-generated method stub
		apparelList.add(apparel);

	}

	public void addElectronics(Electronics electronics) {
		// TODO Auto-generated method stub

		electronicsList.add(electronics);

	}

	public List<FoodItems> getFoodItems() {
		// TODO Auto-generated method stub
		return  this.foodItemList;
	}

	public List<Apparel> getApparel() {
		// TODO Auto-generated method stub
		return this.apparelList;
	}

	public List<Electronics> getElectronics() {
		// TODO Auto-generated method stub
		return electronicsList;
	}

}
