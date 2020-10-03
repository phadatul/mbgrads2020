package com.harry.controllers;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.harry.datalayer.Todo;

import co.harry.Dao.TodoImpl;
import co.harry.Dao.TodoInterface;



@WebServlet("/Todo")
public class TodoServlet extends HttpServlet {
    //private static final long serialVersionUID = 1 L;
    public TodoInterface todoDAO;

    public void init() {
        todoDAO = new TodoImpl();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        String action = request.getParameter("btn-sub");
        if(action.equals("add")) {
        	try {
				insertTodo(request, response);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
        
        else if(action.equals("show")) {
        	try {
				listTodo(request, response);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
        
        else if(action.equals("show1")) {
        	try {
				selectTodo(request, response);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
        
        else if(action.equals("show2")) {
        	try {
				updateTodo(request, response);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
        else if(action.equals("show3")) {
        	try {
				deleteTodo(request, response);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
       
       
       
        

        
    }

    private void listTodo(HttpServletRequest request, HttpServletResponse response)
    throws SQLException, IOException, ServletException {
    	HttpSession session = request.getSession(false);
        
    	String username = (String)session.getAttribute("user");
        List < Todo > listTodo = todoDAO.selectAll(username);
        System.out.println(listTodo);
        request.setAttribute("listTodo", listTodo);
        RequestDispatcher dispatcher = request.getRequestDispatcher("list.jsp");
        dispatcher.forward(request, response);
    }
    
    private void selectTodo(HttpServletRequest request, HttpServletResponse response)
    throws SQLException, IOException, ServletException {
    	HttpSession session = request.getSession(false);
        
    	String username = (String)session.getAttribute("user");
    	String stat=(String) request.getParameter("is_Done");
    	System.out.println(username);
    	System.out.println(stat);
        List < Todo > listTodo1 = todoDAO.select(username,stat);
        System.out.println(listTodo1);
        request.setAttribute("listTodo1", listTodo1);
        RequestDispatcher dispatcher = request.getRequestDispatcher("Select.jsp");
        dispatcher.forward(request, response);
    }


    private void insertTodo(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
    	HttpSession session = request.getSession(false);
        
        String title = request.getParameter("taskname");
        String username = (String)session.getAttribute("user");
        String description = request.getParameter("taskdescription");

        

        boolean isDone = Boolean.valueOf(request.getParameter("isDone"));
        Todo newTodo = new Todo(title, username, description, LocalDate.now(), isDone);
        todoDAO.insert(newTodo);
        response.sendRedirect("todo.jsp");
       
    }

    private void updateTodo(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {
    	HttpSession session = request.getSession(false);
        
    	String username = (String)session.getAttribute("user");
    	String stat=(String) request.getParameter("isDone1");
    	String taskname=(String) request.getParameter("taskname");
    	System.out.println(username);
    	System.out.println(stat);
        Boolean s = todoDAO.update(username,taskname,stat);
        System.out.println(s);
        request.setAttribute("s", s);
        RequestDispatcher dispatcher = request.getRequestDispatcher("update.jsp");
        dispatcher.forward(request, response);
        response.sendRedirect("todo.jsp");


        
    }

    private void deleteTodo(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {
    	HttpSession session = request.getSession(false);
        
    	String username = (String)session.getAttribute("user");
        String Taskname = (String)(request.getParameter("taskname"));
        Boolean s2=todoDAO.delete(Taskname,username);
        request.setAttribute("s2", s2);
        RequestDispatcher dispatcher = request.getRequestDispatcher("Delete.jsp");
        dispatcher.forward(request, response);
        response.sendRedirect("todo.jsp");
        
    }
}