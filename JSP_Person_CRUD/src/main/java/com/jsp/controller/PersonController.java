package com.jsp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dao.PersonDao;
import com.jsp.dto.Person;

@WebServlet("/person")
public class PersonController extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 String name = req.getParameter("name");
		 String email = req.getParameter("email");
		 String gender = req.getParameter("gender");
		 int age = Integer.parseInt(req.getParameter("age"));
		 long phone = Long.parseLong(req.getParameter("phone"));
		 PersonDao dao =new PersonDao();
		 Person person = new Person();
		 person.setName(name);
		 person.setEmail(email);
		 person.setAge(age);
		 person.setPhone(phone);
		 person.setGender(gender);
		Person p = dao.savePerson(person);
		if(p!=null)
		{
			PrintWriter writer = resp.getWriter();
			writer.write("<html><body><h1> User inserted successfully </h1></body></html>");
		}
	}
	
}
