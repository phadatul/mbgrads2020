package com.hsbc.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hsbc.DAO.Word;

/**
 * Servlet implementation class AddServlet
 */
@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet {
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Word word= new Word();
		String newword= request.getParameter("word");
		String meaning= request.getParameter("meaning");
		String synonym= request.getParameter("synonym");
		String antonym= request.getParameter("antonym");
		word.addWord(newword, meaning, synonym, antonym);
		response.sendRedirect("Index.jsp");
	}

}
