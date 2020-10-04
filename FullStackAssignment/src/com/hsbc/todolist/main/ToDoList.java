package com.hsbc.todolist.main;

public class ToDoList {
	private int id;
	private String task;
	private String status;

	public ToDoList() {
	}

	public ToDoList(int id, String task, String status) {
		this.id = id;
		this.task = task;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public int hashCode() {
		return this.id;
	}

	@Override
	public boolean equals(Object obj) {
		ToDoList tdl = (ToDoList) obj;
		if (this.id == tdl.id) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "id = " + this.id + ",    task = " + this.task + ",    status = " + this.status;
	}

}
