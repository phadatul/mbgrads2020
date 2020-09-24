package com.hsbc.DataAccessLayer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import com.hsbc.Entities.Electronics;

/*
 * @author Deepanshu Sharma
 * class containing the method to insert and retrieve items in electronics
 * through serialization and deserialization
 */
public class ElectronicsAccess implements Serializable {
	
	Electronics c =null;
	/**
	 * 
	 */
	private static final long serialVersionUID = 7690108583381090076L;
	/*
	 * this method inserts the object of type electronic in Electronics.data
	 *
	 */
	public void insertElectronic(Electronics c) {
		try {
			FileOutputStream fos = new FileOutputStream("Electronics.data");

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
	 * this method retrieves the object of type electronic from Electronics.data
	 *
	 */
	public Electronics retrieveElectronic() {

		Electronics c = null;

		try {
			FileInputStream fis = new FileInputStream("Electronics.data");

			ObjectInputStream ois = new ObjectInputStream(fis);

			c = (Electronics) ois.readObject();

			ois.close();
			fis.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return c;
	}
}
