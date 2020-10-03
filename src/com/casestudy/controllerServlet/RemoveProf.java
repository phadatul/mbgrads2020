package com.casestudy.controllerServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.casestudy.dao.ServiceByDB;
import com.casestudy.entityModel.Professional;


@WebServlet("/RemoveProf")
public class RemoveProf extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public RemoveProf() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		String id = request.getParameter("profId");
		Professional p=new Professional();
		//p.setProfessionalId(Integer.parseInt(id));
		//String bid=p.getProfessionalId()+"";
		
		ServiceByDB serv = new ServiceByDB();
		serv.removeProf(id);
		
		//out.println(serv.getAllProf());
		
		
	}

}
