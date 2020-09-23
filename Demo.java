package com.hsbc.dataprocessing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Demo {
	public static void main(String[] args) {
		// MyStack<Employee> s=new MyStack<Employee>();

		MyStack<Employee> s = new MyStack<Employee>();

		ArrayList<Employee> list = new ArrayList<Employee>();

		Set<String> set1 = new HashSet<String>();
		set1.add("Java");
		set1.add("Python");
		
		Set<String> set2 = new HashSet<String>();
		set2.add("SQL");
		set2.add("MongoDB");

		list.add(new Employee(12, "abc", 98, set1));
		list.add(new Employee(2, "pqr", 67, null));
		list.add(new Employee(45, "mno", 23, set2));
		list.add(new Employee(1, "xyz", 99, set1));
		IdCompare id = new IdCompare();
		NameComparator name = new NameComparator();

		Collections.sort(list, id);
		System.out.println(list);

	}

}
