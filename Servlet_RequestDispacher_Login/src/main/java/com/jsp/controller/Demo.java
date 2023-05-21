package com.jsp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/demo")
public class Demo extends HttpServlet{
	
	static
	{
		System.out.println("class is loaded into memory");
	}
	
	{
		System.out.println("Object is getting created");
	}
	
	@Override
	public void init() throws ServletException {
		 System.out.println("init method will be called");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 System.out.println("service method will be called ");
		 RequestDispatcher dispatcher = req.getRequestDispatcher("login.html");
		 dispatcher.forward(req, resp);
		
	}
	
	@Override
	public void destroy() {
		 System.out.println("destroy method will be called ");
	}

}
