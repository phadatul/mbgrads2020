package com.hsbc.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.hsbc.connections.JDBCConnection;
import com.hsbc.model.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {

	Statement st;
	PreparedStatement pst;
	JDBCConnection db;

	public EmployeeDAOImpl() {
		db = new JDBCConnection();
	}

	@Override
	public List<Employee> getAll() {
		List<Employee> employeeList = new ArrayList<Employee>();
		try {
			st = db.getStatement();
			ResultSet rs = st.executeQuery("select * from employee");
			while (rs.next()) {
				Employee temp = new Employee(rs.getInt(1), rs.getString(2), rs.getInt(3));
				employeeList.add(temp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return employeeList;
	}

	@Override
	public Employee findEmployee(int empid) {
		Employee e = null;
		try {
			st = db.getStatement();
			ResultSet rs = st.executeQuery("select * from employee where empid=" + empid);
			while (rs.next()) {
				e = new Employee(rs.getInt(1), rs.getString(2), rs.getInt(3));

			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}

		return e;
	}

	@Override
	public void insertEmployee(Employee e) {
		try {
			pst = db.getPreparedStatement("insert into employee values(?,?,?)");
			pst.setInt(1, e.getEmpid());
			pst.setString(2, e.getEnmae());
			pst.setInt(3, e.getSalary());

			pst.execute();
			db.closeConnection();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}

	}

	@Override
	public void updateEmployee(Employee e) {
		try {
			pst = db.getPreparedStatement("update employee set salary=? , ename=? where empid=?");
			pst.setInt(3, e.getEmpid());
			pst.setString(2, e.getEnmae());
			pst.setInt(1, e.getSalary());

			pst.execute();
			db.closeConnection();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}

	}

	@Override
	public void deleteEmployee(Employee e) {
		try {
			pst = db.getPreparedStatement("delete from employee where empid=?");
			pst.setInt(1, e.getEmpid());

			pst.execute();
			db.closeConnection();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}

	}

}
