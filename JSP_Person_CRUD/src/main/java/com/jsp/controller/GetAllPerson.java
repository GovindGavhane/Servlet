package com.jsp.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dao.PersonDao;
import com.jsp.dto.Person;

@WebServlet("/getall")
public class GetAllPerson extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 
		PersonDao dao = new PersonDao();
		List<Person> l =dao.getAllPerson();
		if(l.size()>0)
		{
			req.setAttribute("personlist", l);
			RequestDispatcher dispatcher = req.getRequestDispatcher("getallperson.jsp");
			dispatcher.forward(req, resp);
		}
		else
		{
			 PrintWriter writer = resp.getWriter();
			 writer.write("<html><body><h1> there is no person preset in database </h1></body></html>");
		}
	}
	 
	 

}
