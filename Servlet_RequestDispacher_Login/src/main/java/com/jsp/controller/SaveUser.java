package com.jsp.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dao.UserDao;
import com.jsp.dto.User;

@WebServlet("/saveuser")
public class SaveUser extends HttpServlet {
	
	 @Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 
		 String name = req.getParameter("name");
		 String phone = req.getParameter("phone");
		 String password = req.getParameter("password");
		 UserDao dao = new UserDao();
		 User user = new User();
		 user.setName(name);
		 user.setUserName(phone);
		 user.setPassWord(password);
		User s=  dao.saveUser(user);
		if(s!=null)
		{
			System.out.println("user saved sucessfully");
		}
	}

}
