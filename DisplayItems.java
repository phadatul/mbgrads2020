package com.hsbc.logic;

import java.util.List;

/*
 * @author: Sukriti Shukla
 * purpose: to display the items
 */
public class DisplayItems {
	
	@SuppressWarnings("rawtypes")
	public static void printItems(List l)
	{
		try {
		System.out.println(l.get(l.size()-1));
		System.out.println(l.get(l.size()-2));
		System.out.println(l.get(l.size()-3));
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
