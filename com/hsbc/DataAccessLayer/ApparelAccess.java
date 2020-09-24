package com.hsbc.DataAccessLayer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import com.hsbc.Entities.Apparel;

/*
 * @author Deepanshu Sharma
 * class containing the method to insert and retrieve items in apparel
 * through serialization and deserialization
 */
public class ApparelAccess implements Serializable {

	Apparel a=null;

	/**
	 * 
	 */
	private static final long serialVersionUID = -7424517136353712347L;
	/*
	 * this method inserts the object of type apparel in Apparel.data
	 *
	 */
	public void insertApparel(Apparel a) {
		try {
			FileOutputStream fos = new FileOutputStream("Apparel.data");
			
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(this);
			
			oos.close();
			fos.close();
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	/*
	 * this method retrieves the object of type apparel from Apparel.data
	 *
	 */
	public Apparel retrieveApparel() {
		
		Apparel a= null;
		
		try {
			FileInputStream fis = new FileInputStream("Apparel.data");
			
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			a = (Apparel) ois.readObject();
			
			ois.close();
			fis.close();
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	return a;	
	}
}
