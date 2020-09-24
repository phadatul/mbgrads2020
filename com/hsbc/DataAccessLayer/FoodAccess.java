package com.hsbc.DataAccessLayer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import com.hsbc.Entities.FoodItems;

/*
 * @author Deepanshu Sharma
 * class containing the method to insert and retrieve items in food
 * through serialization and deserialization
 */
public class FoodAccess implements Serializable {
	FoodItems f=null;
	/**
	 * 
	 */
	private static final long serialVersionUID = 8933216324706077837L;

	/*
	 * this method inserts the object of type food in FoodItems.data
	 *
	 */
	public void insertFoodItem(FoodItems f) {
		try {
			FileOutputStream fos = new FileOutputStream("FoodItems.data");

			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(this);

			oos.close();
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

	/*
	 * this method retrieves objects from FoodItems.data
	 * 
	 */

	public FoodItems retrieveFoodItem() {

		FoodItems f = null;

		try {
			FileInputStream fis = new FileInputStream("FoodItems.data");

			ObjectInputStream ois = new ObjectInputStream(fis);

			f = (FoodItems) ois.readObject();

			ois.close();
			fis.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return f;
	}
}
