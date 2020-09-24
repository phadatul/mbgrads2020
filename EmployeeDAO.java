package com.hsbc.dao;

import java.util.List;

import com.hsbc.model.Employee;

public interface EmployeeDAO {
	
	public List<Employee> getAllEmployees();

	public void insertEmp(Employee e);

	public void deleteEmployee(int empid);

	public void updateEmployeeSalary(int empid, double salary);

	public Employee getEmployee(int empid);

}
