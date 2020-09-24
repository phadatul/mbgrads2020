package com.hsbc.training.viewLayer;
import com.hsbc.training.exceptions.*;
import com.hsbc.training.businessLogicLayer.*;
import java.util.Scanner; 

/**
 * 
 * @author Neha Balasubramanian
 *
 * MAIN CLASS
 */

public class Test {
	
	public static void main(String[] args) {
		
		GenerateReport r = new GenerateReport();
		System.out.println("Generate report for \n" + "1. Food Items \n"+ "2. Apparels \n"+ "3. Electronics \n");
		Scanner s = new Scanner(System.in); 
		int  in= s.nextInt();
		switch(in)
		{
		
		case 1: r.generateReportFoodItems();
				break;
		case 2: r.generateApparels();
				break;
		case 3: r.generateReportElectronics();
				break;
		default: throw new InputException("Wrong Input");
		}
		
		
	}

}
