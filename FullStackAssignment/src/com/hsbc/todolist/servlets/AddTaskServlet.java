package com.hsbc.todolist.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hsbc.todolist.dao.ToDoListDAOImpl;

@WebServlet("/AddTaskServlet")
public class AddTaskServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AddTaskServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		int id = Integer.parseInt(request.getParameter("id"));
		String task = request.getParameter("task");
		String status = request.getParameter("status");
		RequestDispatcher rd = request.getRequestDispatcher("addtask.jsp");
		ToDoListDAOImpl tdli = new ToDoListDAOImpl();
		if (tdli.idCheck(id)) {
			tdli.addTask(id, task, status);
			request.setAttribute("alertji", "Task added successfully.");
			rd.forward(request, response);
		} else {
			request.setAttribute("alertji", "Task could not be added. Use other id for the task.");
			rd.forward(request, response);
		}
	}

}
