package com.hsbc.dataprocessing;

import java.util.Set;

public class Employee implements Comparable<Employee> {

	int id;
	String name;
	double salary;
	Set<String> skills;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, double salary, Set<String> skills) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.skills = skills;
	}



	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", skills=" + skills + "]";
	}

	@Override
	public int compareTo(Employee e) {
		if (this.salary > e.salary)
			return 1;
		else if (this.salary < e.salary)
			return -1;
		else
			return 0;
	}

}
