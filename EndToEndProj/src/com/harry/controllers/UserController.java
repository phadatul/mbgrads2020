package com.harry.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.harry.datalayer.User;

import co.harry.Dao.UserDao;



@WebServlet("/register")
public class UserController extends HttpServlet {
    
    private UserDao userDao;

    public void init() {
        userDao = new UserDao();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        register(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.sendRedirect("Register.jsp");
    }

    private void register(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String firstName = request.getParameter("firstname");
        String lastName = request.getParameter("lastname");
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        User employee = new User();
        employee.setFirstName(firstName);
        employee.setLastName(lastName);
        employee.setUsername(username);
        employee.setPassword(password);

        try {
            int result = userDao.registerEmployee(employee);
            if (result == 1) {
                request.setAttribute("mssg", "User Registered Successfully!");
            }
            else {
                request.setAttribute("mssg", "User not Registered !");
            }


        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        RequestDispatcher dispatcher = request.getRequestDispatcher("Register.jsp");
        dispatcher.forward(request, response);
    }
}