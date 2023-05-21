package com.jsp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dao.UserDao;
import com.jsp.dto.User;

@WebServlet(urlPatterns = "/getuser")
public class GetUserServlet extends HttpServlet
{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int id = Integer.parseInt(req.getParameter("id"));
		UserDao dao = new UserDao();
		User u=dao.getUserById(id);
		PrintWriter writer = resp.getWriter();
		if(u!=null)
		{
			writer.write("<html><body><h1> Id :"+u.getId()+"</h1>");
			writer.write("<h1> Name :"+u.getName()+"</h1>");
			writer.write("<h1> Age :"+u.getAge()+"</h1>");
			writer.write("<h1> Email :"+u.getEmail()+"</h1>");
			writer.write("<h1> Gender :"+u.getGender()+"</h1>");
			writer.write("<h1> Phone :"+u.getPhone()+"</h1></body></html>");
		}
		else
		{
			writer.write("<html><body><h1> User Not Found</h1></body></html>");
		}
		
	}
	
}
