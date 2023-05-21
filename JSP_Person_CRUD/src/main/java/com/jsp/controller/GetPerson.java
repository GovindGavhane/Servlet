package com.jsp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dao.PersonDao;
import com.jsp.dto.Person;

@WebServlet("/getperson")
public class GetPerson extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 int id = Integer.parseInt(req.getParameter("id"));
		 PersonDao dao = new PersonDao();
		 Person p =dao.getPerson(id);
		 if(p!=null)
		 {
			 req.setAttribute("person", p);
			 RequestDispatcher dispatcher = req.getRequestDispatcher("view.jsp");
			 dispatcher.forward(req, resp);
		 }
		 else
		 {
			 PrintWriter writer = resp.getWriter();
			 writer.write("<html><body><h1> id with person does not exist</h1></body></html>");
		 }
		 
	}

}
