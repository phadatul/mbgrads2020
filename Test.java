/*
 * Author:Riya Puri
 * Purpose: This program is used for data processing and Showing results
 */

package com.hsbc.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.hsbc.model.Apparel;
import com.hsbc.model.Electronics;
import com.hsbc.model.FoodItems;

public class Test {
	
public static void main(String args[])
	{
         Scanner in=new Scanner(System.in);
		String input=in.nextLine();
		 Apparel a1=new Apparel(222,"T-Shirt",100,"Large","Cotton",50);
		 Apparel a2=new Apparel(432,"Shirt",100,"Medium","Cotton",10);
		 Apparel a3=new Apparel(221,"Sweater",100,"Medium","Woolen",40);
		 Apparel a4=new Apparel(103,"Pant",100,"Large","Cotton",50);
		 
		 Electronics e1=new Electronics(101,"TV",10000,12,50);
		 Electronics e2=new Electronics(102,"Mobile",10000,12,50);
		 Electronics e3=new Electronics(103,"Watch",10000,16,30);
		 Electronics e4=new Electronics(104,"Radio",10000,18,80);
		 
		 FoodItems f1=new FoodItems(301,"Cake",10,"10 Sept","30 Sept",true,50);
		 FoodItems f2=new FoodItems(302,"Cake",10,"10 Sept","30 Sept",true,50);
		 FoodItems f3=new FoodItems(303,"Cake",10,"10 Sept","30 Sept",true,50);
		 FoodItems f4=new FoodItems(103,"Cake",10,"10 Sept","30 Sept",true,50);
		 
		 ArrayList<Apparel> a11=new ArrayList<Apparel>();
		 ArrayList<Electronics> a12=new ArrayList<Electronics>();
		 ArrayList<FoodItems> a13=new ArrayList<FoodItems>();
		 
		 a11.add(a1);
		 a11.add(a2);
		 a11.add(a3);
		 a11.add(a4);
		 
		a12.add(e1);
		a12.add(e2);
		a12.add(e3);
		a12.add(e4);
		
		a13.add(f1);
		a13.add(f2);
		a13.add(f3);
		a13.add(f4);
		
	}

}
