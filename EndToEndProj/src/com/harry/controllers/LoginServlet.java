package com.harry.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.harry.datalayer.LoginUser;

import co.harry.Dao.LoginDao;


@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    
    private LoginDao loginDao;

    public void init() {
        loginDao = new LoginDao();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.sendRedirect("login.jsp");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        authenticate(request, response);
    }

    private void authenticate(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        LoginUser login = new LoginUser();
        login.setUsername(username);
        login.setPassword(password);
        
      HttpSession session = request.getSession();
      session.setAttribute("user", username);
      
      
        try {
            if (loginDao.validate(login)) {
                RequestDispatcher dispatcher = request.getRequestDispatcher("todo.jsp");
                dispatcher.forward(request, response);
            } else {
            	
            	request.setAttribute("mssg", "User Credentials not valid!!!!  Please check again the credentials");
            	RequestDispatcher dispatcher = request.getRequestDispatcher("Login.jsp");
                dispatcher.forward(request, response);
                
            }
            
            
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}