package com.hsbc.factory;

import com.hsbc.model.Employee;

public class EmployeeFactory {

	private EmployeeFactory() {
		// TODO Auto-generated constructor stub
	}

	public static EmployeeFactory getInstance() {
		return new EmployeeFactory();
	}

//FACTORY METHOD
	public Employee getInstace(int id, String name, int salary) {

		// LOGIC GOES HERE
		return new Employee();
	}

}
