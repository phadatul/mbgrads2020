package com.hsbc.dao;

import java.util.List;

import com.hsbc.model.Employee;


/**
 * 
 * @author aadish
 *We are going to implement this interface to perform CRUD opetions using EMployee.
 */
public interface EmployeeDAO {

	public List getAllEmployees();

	public Employee getEmployee(int id);

	public void addEmployee(Employee e);

	public void updateEmployee(Employee e);

	public void deleteEmployee(Employee e);

}
