package com.tap.entity;

import java.util.ArrayList;
import java.util.List;

public class Launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee("rahul","raul@gmsail.com");
		Employee e2=new Employee("anu","anu@gmsail.com");
		Employee e3=new Employee("vijay","vijay@gmsail.com");
		
		
		Project p1=new Project("VideoEditor");
		Project p2=new Project("ImageProcessing");
		
		List<Project>projects1=new ArrayList<Project>();
		projects1.add(p1);
		
		List<Project>projects2=new ArrayList<Project>();
		projects2.add(p1);
		projects2.add(p2);
		
		
		
		List<Employee>employees1=new ArrayList<Employee>();
		employees1.add(e1);
		employees1.add(e2);
		employees1.add(e3);
		
		List<Employee>employees2=new ArrayList<Employee>();
		employees2.add(e2);
		employees2.add(e3);
		
		e1.setProjects(projects1);
		e2.setProjects(projects2);
		e3.setProjects(projects2);
		
		
		p1.setEmp(employees1);
		p2.setEmp(employees2);
		
		
		EmployeeDAOIMPL em=new EmployeeDAOIMPL() ;
		em.add(e1);
		em.add(e2);
		em.add(e3);
	    System.out.println("done");
			
		
	}
}
