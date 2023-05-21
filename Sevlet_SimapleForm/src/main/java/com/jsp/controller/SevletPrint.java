package com.jsp.controller;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class SevletPrint extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		 
		String name = req.getParameter("name");
		int age = Integer.parseInt(req.getParameter("age"));
		System.out.println("Name :"+name);
		System.out.println("Age : "+age);
		
		
	}

}
