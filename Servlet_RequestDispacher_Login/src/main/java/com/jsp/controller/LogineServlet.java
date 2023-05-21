package com.jsp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dao.UserDao;
import com.jsp.dto.User;

@WebServlet("/login")
public class LogineServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 
		String phone = req.getParameter("phone");
		String password = req.getParameter("password");
		UserDao dao = new UserDao();
		User user = dao.verifiedUser(phone, password);
		if(user!=null)
		{
			PrintWriter writer = resp.getWriter();
			writer.write("<html><body><h1> ID :"+user.getId()+"</h1>");
			writer.write("<h1> Name :"+user.getName()+"</h1>");
			writer.write("<h1> Phone :"+user.getUserName()+"</h1>");
			writer.write("<h1> Password :"+user.getPassWord()+"</h1></body></html>");
		}else
		{
			PrintWriter writer = resp.getWriter();
			writer.write("<html><body><h1> Invalid Credentials</h1></body></html>");
			RequestDispatcher dispatcher = req.getRequestDispatcher("login.html");
			dispatcher.include(req, resp);
		}
	}

}
