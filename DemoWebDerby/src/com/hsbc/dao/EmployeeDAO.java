package com.hsbc.dao;

import java.util.List;

import com.hsbc.model.Employee;

public interface EmployeeDAO {

	public List<Employee> getAll();

	public Employee findEmployee(int empid);

	public void insertEmployee(Employee e);

	public void updateEmployee(Employee e);

	public void deleteEmployee(Employee e);

}
