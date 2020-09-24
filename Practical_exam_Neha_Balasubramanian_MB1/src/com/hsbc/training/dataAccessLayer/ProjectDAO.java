package com.hsbc.training.dataAccessLayer;

import java.util.ArrayList;

import com.hsbc.training.entityClasses.Apparel;
import com.hsbc.training.entityClasses.Electronics;
import com.hsbc.training.entityClasses.FoodItems;


/**
 * 
 * @author Neha Balasubramanian
 *
 * 
 */


public interface ProjectDAO {
	
	public void addRecordsApparel(Apparel a);
	public void addRecordsFoodItems(FoodItems f);
	public void addRecordsElectronics(Electronics e);
	
	
	public ArrayList<Apparel> getRecordsApparel(); 
	public ArrayList<FoodItems> getRecordsFoodItems(); 
	public ArrayList<Electronics> getRecordsElectronics(); 
	
	
	
	

}
