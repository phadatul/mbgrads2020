package com.hsbc.training.businessLogicLayer;
import com.hsbc.training.dataAccessLayer.*;
import com.hsbc.training.entityClasses.Apparel;
import com.hsbc.training.entityClasses.Electronics;
import com.hsbc.training.entityClasses.FoodItems;

/**
 * 
 * @author Neha Balasubramanian
 *
 * THE PROGRAM CALLS THE DATA ACCESS LAYER TO FETCH THE NECESSARY DETAILS.
 */

public class GenerateReport {
	
	ProjectDAOImpl p = new ProjectDAOImpl();

	public void generateReportElectronics() {
		
		Electronics e1 = new Electronics(1, "Mobile", 0, 0, 0);
		Electronics e2 = new Electronics(1, "TV", 0, 0, 0);
		Electronics e3 = new Electronics(1, "AC", 0, 0, 0);
		Electronics e4 = new Electronics(1, "Tablet", 0, 0, 0);
		p.addRecordsElectronics(e1);
		p.addRecordsElectronics(e2);
		p.addRecordsElectronics(e3);
		p.addRecordsElectronics(e4);
		System.out.println(p.getRecordsElectronics());
	}

	public void generateApparels() {
		
		Apparel a1 = new Apparel(1, "Shirt", 0, 0, null, 0);
		Apparel a2 = new Apparel(1, "Pant", 0, 0, null, 0);
		Apparel a3 = new Apparel(1, "T-shirt", 0, 0, null, 0);
		Apparel a4 = new Apparel(1, "Dress", 0, 0, null, 0);
		p.addRecordsApparel(a1);
		p.addRecordsApparel(a2);
		p.addRecordsApparel(a3);
		p.addRecordsApparel(a4);
		System.out.println(p.getRecordsApparel());
		
		
	}

	public void generateReportFoodItems() {
		
		FoodItems f1 = new FoodItems(1, "Noodles", 40, null, null, true, 20);
		FoodItems f2 = new FoodItems(2, "Bread", 20, null, null, true, 720);
		FoodItems f3 = new FoodItems(3, "Jam", 30, null, null, true, 270);
		FoodItems f4 = new FoodItems(4, "Jelly", 70, null, null, true, 80);
		p.addRecordsFoodItems(f1);
		p.addRecordsFoodItems(f2);
		p.addRecordsFoodItems(f3);
		p.addRecordsFoodItems(f4);
		System.out.println(p.getRecordsFoodItems());
		
		
		
	}

}
