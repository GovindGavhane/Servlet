package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.User;

public class UserDao {
	
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
	EntityManager manager = factory.createEntityManager();
	EntityTransaction trasaction = manager.getTransaction();
	
	
	public User saveUser(User user)
	{
		trasaction.begin();
		manager.persist(user);
		trasaction.commit();
		return user;
	}
	
	public User verifiedUser(String phone , String password)
	{
		 Query q = manager.createQuery("select u from User u where  u.phone=?1"+" and u.passWord=?2");
		 q.setParameter(1, phone);
		 q.setParameter(2, password);
		 List<User> l = q.getResultList();
		 if(l.size()>0)
		 {
			 return l.get(0);
		 }
		 else
		 {
			 return null;
		 }
	}

}
