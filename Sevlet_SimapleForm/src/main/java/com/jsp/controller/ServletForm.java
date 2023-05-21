package com.jsp.controller;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ServletForm extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

       String name = req.getParameter("name");
       int age = Integer.parseInt(req.getParameter("age")); 
       String email = req.getParameter("email");
       String gender = req.getParameter("gender");
      long phone = Long.parseLong(req.getParameter("phone")); 
       
       System.out.println("Details of form");
       System.out.println("Name : "+name);
       System.out.println("Age : "+age);
       System.out.println("Email : "+email);
       System.out.println("gender : "+gender);
       System.out.println("phone : "+phone);
	}

}
