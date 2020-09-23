package com.hsbc.Main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import com.hsbc.model.Book;
import com.hsbc.utility.PrintUtil;
import com.hsbc.utility.SortUtil;
import com.hsbc.utility.StoreUtil;

public class Test {
	public static void main(String[] args) {
		Set<String> set1 = new HashSet<String>();
		set1.add("Dan Brown");
		set1.add("Cathy Sierra");
		Set<String> set2 = new HashSet<String>();
		set1.add("HI");
		set1.add("CBYE");

		Book b1 = new Book(1, "abc", set1, 450);
		Book b2 = new Book(2, "mno", set2, 499);
		Book b3 = new Book(6, "asd", set1, 199);
		Book b4 = new Book(22, "www", set2, 999);

		StoreUtil<Book> store = new StoreUtil<Book>();
		store.addRecord(b1);
		store.addRecord(b3);
		store.addRecord(b2);
		store.addRecord(b4);

		PrintUtil.printRecords(store.getRecords());
		SortUtil.sortByPrice(store.getRecords());
		PrintUtil.printRecords(store.getRecords());
		SortUtil.sortByName(store.getRecords());
		PrintUtil.printRecords(store.getRecords());

		
		ArrayList<String> x=new ArrayList<String>();
		x.add("ATUL");
		x.add("AADISH");
		
		PrintUtil.printRecords(x);
	}

}
