package com.tap.entity;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class EmployeeDAOIMPL implements EmployeeDAO {

	
	Session session=null;
	public EmployeeDAOIMPL() {
	session=new Configuration().configure().addAnnotatedClass(Employee.class).addAnnotatedClass(Project.class).buildSessionFactory().openSession();
	}
	
	@Override
	public void add(Employee e) {
	  session.beginTransaction();
	  session.persist(e);
	  session.getTransaction().commit();
	
	}

}
