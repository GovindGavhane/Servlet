package com.jsp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dao.UserDao;

@WebServlet(urlPatterns = "/deleteuser")
public class DeleteUser extends HttpServlet {
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 doDelete(req,resp);
	}
	
	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int id = Integer.parseInt(req.getParameter("id"));
		UserDao dao = new UserDao();
		boolean b =dao.deleteUser(id);
		PrintWriter writer = resp.getWriter();
		if(b)
		{
			writer.write("<html></body><h1> User deleted Sucessfully</h1></body></html>");
		}
		else
		{
			writer.write("<html></body><h1> User with id does not Exist </h1></body></html>");
		}
		
	}

}
