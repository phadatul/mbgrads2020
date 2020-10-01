package com.hsbc.test;

import com.hsbc.dao.EmployeeDAO;
import com.hsbc.dao.EmployeeDAOImpl;
import com.hsbc.model.Employee;

public class Demo {
	public static void main(String[] args) {
		EmployeeDAOImpl data=new EmployeeDAOImpl();
		
		System.out.println(data.findEmployee(1));
	}

}
