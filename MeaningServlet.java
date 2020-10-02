package com.hsbc.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MeaningServlet
 */
@WebServlet("/MeaningServlet")
public class MeaningServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String meaning= (String) request.getAttribute("Meaning");
		String synonym= (String) request.getAttribute("Synonym");
		String antonym= (String) request.getAttribute("Antonym");
		RequestDispatcher rd= request.getRequestDispatcher("Meaning.jsp");
		request.setAttribute("Meaning",meaning);
		request.setAttribute("Synonym", synonym);
		request.setAttribute("Antonym", antonym);
		rd.forward(request, response);
		
		
	}

}
