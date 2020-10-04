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

@WebServlet("/UpdateTaskServlet")
public class UpdateTaskServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public UpdateTaskServlet() {
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
		String status = request.getParameter("status");
		RequestDispatcher rd = request.getRequestDispatcher("updatetask.jsp");
		ToDoListDAOImpl tdli = new ToDoListDAOImpl();
		
		if (tdli.idCheck(id)) {
			request.setAttribute("alertji", "Task does not exist.");
			rd.forward(request, response);
		} else {
			tdli.updateTask(id, status);
			request.setAttribute("alertji", "Task updated successfully.");
			rd.forward(request, response);
		}
	}

}
