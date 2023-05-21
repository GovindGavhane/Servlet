package com.jsp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dao.UserDao;
import com.jsp.dto.User;

public class UserServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String name = req.getParameter("name");
		String email = req.getParameter("email");
		int age = Integer.parseInt(req.getParameter("age"));
		long phone = Long.parseLong(req.getParameter("phone"));
		String gender = req.getParameter("gender");
		User user = new User();
		user.setName(name);
		user.setEmail(email);
		user.setAge(age);
		user.setGender(gender);
		user.setPhone(phone);
		UserDao dao = new UserDao();
		User u = dao.saveUser(user);
		PrintWriter writer = resp.getWriter();
		writer.write("<html><body><h1> User saved sucessfully and id is : " + u.getId() + "</h1></body></html>");
	}

}
