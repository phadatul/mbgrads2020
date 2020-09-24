package com.hsbc.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.hsbc.connectivity.DBConnection;
import com.hsbc.model.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {

	Statement st;
	DBConnection db;

	public EmployeeDAOImpl() {
		db = new DBConnection();
		st = db.getStatement();
	}

	@Override
	public List<Employee> getAllEmployees() {

		List<Employee> list = new ArrayList<Employee>();
		try {
			PreparedStatement st = db.getPreparedStatement("select * from helloworld");
			ResultSet rs = st.executeQuery();
			while (rs.next()) {
				list.add(new Employee(rs.getInt("id"), rs.getString("name"), Double.parseDouble(rs.getString(3))));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public void insertEmp(Employee e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteEmployee(int empid) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateEmployeeSalary(int empid, double salary) {
		try {
			PreparedStatement ps = db.getPreparedStatement("update helloworld set salary=? where id=?");
			ps.setInt(1, (int) salary);
			ps.setInt(2, empid);

			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public Employee getEmployee(int empid) {
		// TODO Auto-generated method stub
		return null;
	}

}
