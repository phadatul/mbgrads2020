package com.hsbc.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hsbc.DAO.Word;

/**
 * Servlet implementation class UpdateServlet
 */
@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Word word= new Word();
		String newword= request.getParameter("word");
		
		String meaning=request.getParameter("meaning");;
		String synonym= request.getParameter("synonym");;
		String antonym= request.getParameter("antonym");;
		String details[]=null;
		try {
		 details= word.getDetails(newword).split(";");
		}
		catch (Exception e) {
			RequestDispatcher rd= request.getRequestDispatcher("Update.jsp");
			request.setAttribute("errormsg", "Word not Found!!!!");
			rd.forward(request, response);
			
			
		}
		if(meaning.isEmpty())
		{
			meaning=details[0];
		}
		if(synonym.isEmpty())
		{
			synonym=details[1];
		}
		if(antonym.isEmpty())
		{
			antonym=details[2];
		}
		word.updateWord( meaning, synonym, antonym, newword);
		response.sendRedirect("Index.jsp");
	}

}
