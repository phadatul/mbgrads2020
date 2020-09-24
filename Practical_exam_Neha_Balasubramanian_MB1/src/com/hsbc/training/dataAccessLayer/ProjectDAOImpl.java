package com.hsbc.training.dataAccessLayer;

import java.util.ArrayList;

import com.hsbc.training.entityClasses.Apparel;
import com.hsbc.training.entityClasses.Electronics;
import com.hsbc.training.entityClasses.FoodItems;

/**
 * 
 * @author Neha Balasubramanian
 *
 * IMPLEMENTS THE INTERFACE AND ADDS AND FETCHES DATA TO AND FROM THE COLLECTION. 
 */

public class ProjectDAOImpl implements ProjectDAO{

	ArrayList<Apparel> apparel= new ArrayList<>(); 
	ArrayList<FoodItems> foodItems= new ArrayList<>(); 
	ArrayList<Electronics> electronics= new ArrayList<>();
	
	@Override
	public void addRecordsApparel(Apparel a) {
		// TODO Auto-generated method stub
		apparel.add(a);
		
	}
	@Override
	public void addRecordsFoodItems(FoodItems f) {
		// TODO Auto-generated method stub
		foodItems.add(f);
		
	}
	@Override
	public void addRecordsElectronics(Electronics e) {
		// TODO Auto-generated method stub
		electronics.add(e);
		
	}
	@Override
	public ArrayList<Apparel> getRecordsApparel() {
		return apparel;
	}
	@Override
	public ArrayList<FoodItems> getRecordsFoodItems() {
		return foodItems;
	}
	@Override
	public ArrayList<Electronics> getRecordsElectronics() {
		return electronics;
	}
}	
	