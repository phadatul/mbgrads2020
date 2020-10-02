package com.hsbc.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hsbc.DAO.Word;

/**
 * Servlet implementation class DictionaryOpsServlet
 */
@WebServlet("/DictionaryOpsServlet")
public class DictionaryOpsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String ops= request.getParameter("ops");
		switch(ops) {
		
		case "search":
			String str= request.getParameter("word");
			Word word= new Word();
			if(str.isEmpty())
			{
				RequestDispatcher rd2= request.getRequestDispatcher("Index.jsp");
				request.setAttribute("errormsg", "Word not Found!!!!");
				rd2.forward(request, response);
				break;
			}
			
		RequestDispatcher rd= request.getRequestDispatcher("MeaningServlet");
			
			
			
			String details[]=null;
			try {
			 details= word.getDetails(str).split(";");
			 request.setAttribute("Meaning", details[0]);
				request.setAttribute("Synonym", details[1]);
				request.setAttribute("Antonym", details[2]);
				
				rd.forward(request, response);
				
				
			}
			catch (Exception e) {
				RequestDispatcher rd2= request.getRequestDispatcher("Index.jsp");
				request.setAttribute("errormsg", "Word not Found!!!!");
				rd2.forward(request, response);
				
				
			}
			break;
		case "add":
			RequestDispatcher rd3= request.getRequestDispatcher("Add.jsp");
			rd3.forward(request, response);
			break;
		case "update":
			RequestDispatcher rd4= request.getRequestDispatcher("Update.jsp");
			rd4.forward(request, response);
			
		}
		
		
		
	}

}
