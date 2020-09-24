package com.practical.ViewLayer;


import com.practical.BusinessLogicLayer.AddAndRetriveMethodsInnvocation;

public class Main {
	/**This is the main method from where user will operate
	 * @author Mohit Khandelwal
	 * @param args
	 */
	public static void main(String[] args) {
		AddAndRetriveMethodsInnvocation adrm = new AddAndRetriveMethodsInnvocation();
		
		//This is the input key which can be changed and taken from user and show the appropriate results
		String key = "food item";
		switch (key) {
		case "food item":adrm.retriveFood();
			
			break;
		
		case "Apparel item":adrm.retriveApparel();
		
		break;
		case "Electronics item":adrm.retriveElectronics();
		
		break;

		default:
			break;
		}
		
		System.out.println("\n\nThe Results for All the classes :\n");
	
		adrm.retriveApparel();System.out.println();
		adrm.retriveElectronics();System.out.println();
		adrm.retriveFood();System.out.println();
		
	}

}
