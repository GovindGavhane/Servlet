package com.jsp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.dto.User;

public class UserDao {
	
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
	EntityManager manager=  factory.createEntityManager();
	EntityTransaction trasaction = manager.getTransaction();
	
	public User saveUser(User user)
	{
		trasaction.begin();
		manager.persist(user);
		trasaction.commit();
		return user;
	}
	
	public User getUserById(int id)
	{
		return manager.find(User.class, id);
	}
	
	public boolean deleteUser(int id)
	{
		User user = getUserById(id);
		if(user!=null)
		{
		trasaction.begin();
		manager.remove(user);
		trasaction.commit();
		return true;
		}
		return false;
	}

}
