package com.hsbc.todolist.dao;

import java.util.List;

import com.hsbc.todolist.main.ToDoList;

public interface ToDoListDAO {
	public abstract void addTask(int id, String task, String status);

	public abstract void updateTask(int id, String status);

	public abstract void deleteTask(int id);

	public abstract List<ToDoList> printList();
}
