package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.Person;

public class PersonDao {
	
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
	EntityManager manager = factory.createEntityManager();
	EntityTransaction trasaction = manager.getTransaction();
	
	public Person savePerson(Person person)
	{
		trasaction.begin();
		manager.persist(person);
		trasaction.commit();
		return person;
	}
	
	public Person getPerson(int id)
	{
		return manager.find(Person.class, id);
	}
	
	public Person verifiedPerson(String email , Long phone)
	{
		Query q = manager.createQuery("select p from Person p where p.email=?1 and p.phone=?2");
		q.setParameter(1, email);
		q.setParameter(2, phone);
		List<Person> persons = q.getResultList();
		if(persons.size()>0)
		{
			return persons.get(0);
		}
		else
		{
			return null;
		}
	}
	
	public List<Person> getAllPerson()
	{
		Query q = manager.createQuery("select u from Person u");
		List<Person> persons = q.getResultList();
		return persons;
	}
	
	 

}
