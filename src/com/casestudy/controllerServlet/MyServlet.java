package com.casestudy.controllerServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.casestudy.dao.ServiceByDB;
import com.casestudy.entityModel.Professional;

@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public MyServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		String id = request.getParameter("profId");
		String name = request.getParameter("profName");
		String salary = request.getParameter("basicSalary");
		String medical = request.getParameter("medical");

		Professional p = new Professional();
		p.setProfessionalId(Integer.parseInt(id));
		p.setProfessionalName(name);
		p.setBasicSalary(Integer.parseInt(salary));
		p.setMedical(Double.parseDouble(medical));

		String bid = p.getProfessionalId() + "";
		String bname = p.getProfessionalName() + "";
		String bbasicSalary = p.getBasicSalary() + "";
		String bgrossSalary = p.calculateGrossSalary() + "";
		String bnetSalary = p.calculateNetSalary() + "";

		ServiceByDB serv = new ServiceByDB();

		serv.insertProf(bid, bname, bbasicSalary, bgrossSalary, bnetSalary);

		RequestDispatcher d = request.getRequestDispatcher("TableView.jsp");
		request.setAttribute("Result", serv.getAllProf());
		d.forward(request, response);

	}

}
