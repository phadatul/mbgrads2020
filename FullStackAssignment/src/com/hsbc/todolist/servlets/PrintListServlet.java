package com.hsbc.todolist.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hsbc.todolist.dao.ToDoListDAOImpl;
import com.hsbc.todolist.main.ToDoList;

@WebServlet("/PrintListServlet")

public class PrintListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public PrintListServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ToDoListDAOImpl tdli = new ToDoListDAOImpl();
		List<ToDoList> printList = tdli.printList();
		RequestDispatcher rd = request.getRequestDispatcher("printlist.jsp");
		request.setAttribute("datagg", printList);
		rd.forward(request, response);
	}

}
