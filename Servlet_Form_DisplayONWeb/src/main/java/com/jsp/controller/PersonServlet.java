package com.jsp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PersonServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 
		String name = req.getParameter("name");
		int age = Integer.parseInt(req.getParameter("age"));
		String email = req.getParameter("email");
		long phone = Long.parseLong(req.getParameter("phone"));
		String gender = req.getParameter("gender");
		PrintWriter writer = resp.getWriter();
		writer.write("<html><body><h1> Name :"+name+"</h1>");
		writer.write("<h1> Age :"+age+"</h1>");
		writer.write("<h1> Email :"+email+" </h1>");
		writer.write("<h1> phone :"+phone+" </h1>");
		writer.write("<h1> Gender :"+gender+"</h1></body></html>");
	}

}
