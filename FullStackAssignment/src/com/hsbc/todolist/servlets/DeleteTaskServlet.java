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

@WebServlet("/DeleteTaskServlet")
public class DeleteTaskServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public DeleteTaskServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		int id = Integer.parseInt(request.getParameter("id"));
		RequestDispatcher rd = request.getRequestDispatcher("deletetask.jsp");
		ToDoListDAOImpl tdli = new ToDoListDAOImpl();
		if (tdli.idCheck(id)) {
			request.setAttribute("alertji", "Cannot delete the task. Does not exist in the list.");
			rd.forward(request, response);
		} else {
			tdli.deleteTask(id);
			request.setAttribute("alertji", "Task deleted successfully.");
			rd.forward(request, response);
		}
	}

}
