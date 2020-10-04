package com.hsbc.todolist.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.hsbc.todolist.connectivity.DBConnection;
import com.hsbc.todolist.main.ToDoList;

public class ToDoListDAOImpl implements ToDoListDAO {

	PreparedStatement pst;
	DBConnection db = new DBConnection();
	ArrayList<ToDoList> toDoList = null;

	@Override
	public void addTask(int id, String task, String status) {
		pst = db.getPreparedStatement("insert into todolist values(?,?,?)");
		try {
			pst.setInt(1, id);
			pst.setString(2, task);
			pst.setString(3, status);
			pst.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		db.closeConnection();
	}

	@Override
	public void updateTask(int id, String status) {
		pst = db.getPreparedStatement("update todolist set status=? where id=?");
		try {
			pst.setString(1, status);
			pst.setInt(2, id);
			pst.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		db.closeConnection();
	}

	@Override
	public void deleteTask(int id) {
		pst = db.getPreparedStatement("delete from todolist where id=?");
		try {
			pst.setInt(1, id);
			pst.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		db.closeConnection();
	}

	@Override
	public ArrayList<ToDoList> printList() {
		this.toDoList = new ArrayList<ToDoList>();
		pst = db.getPreparedStatement("select * from todolist");
		ResultSet rs;
		try {
			rs = pst.executeQuery();
			while (rs.next()) {
				ToDoList tdl = new ToDoList();
				tdl.setId(rs.getInt(1));
				tdl.setTask(rs.getString(2));
				tdl.setStatus(rs.getString(3));
				this.toDoList.add(tdl);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		db.closeConnection();
		return this.toDoList;
	}

	public boolean idCheck(int id) {
		if (this.printList() == null) {
			return true;
		} else {
			Iterator<ToDoList> i = this.printList().iterator();
			while (i.hasNext()) {
				if (i.next().getId() == id) {
					return false;
				}
			}
			return true;
		}
	}
}
