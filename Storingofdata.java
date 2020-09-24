package com.hsbc.storage;

import java.util.ArrayList;
import java.util.List;

public class Storingofdata<T>{
	//creating 3 arraylist to store the 3 categories
	ArrayList<T> a;
	ArrayList<T> a1;
	ArrayList<T> a2;
	public Storingofdata() {
		a=new ArrayList<T>();
		a1=new ArrayList<T>();
		a2=new ArrayList<T>();
		
	}
		public void addFoodRecord(T record) {
			a.add(record);
		}

		public List<T> getFoodRecords() {
			return this.a;
		}
		
		public void addApparelRecord(T record) {
			a1.add(record);
		}

		public List<T> getApparelRecords() {
			return this.a1;
		}
		public void addElectronicsRecord(T record) {
			a2.add(record);
		}

		public List<T> getElectronicRecords() {
			return this.a2;
		}
	}


