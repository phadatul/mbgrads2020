package com.hsbc.dataprocessing;

import java.util.ArrayList;

public class MyStack<T> { // GENERICS
	ArrayList<T> al = new ArrayList<T>();
	int data;

	public void push(T data) {
		al.add(data);
	}

	public T pop() {
		T temp = (T) al.remove(al.size() - 1);
		return temp;
	}

	public void display() {
		System.out.println(al);
	}

}
