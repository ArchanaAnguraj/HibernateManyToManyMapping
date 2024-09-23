package com.tap.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="project")
public class Project {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="proj_id")
	private int proj_id; 
	@Column(name="")
	private String name;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="emp_proj", joinColumns= @JoinColumn(name="pro_id"),inverseJoinColumns = @JoinColumn(name="emp_id"))
	private List<Employee>emp;
	
	
	
	
	/**
	 * @return the emp
	 */
	public List<Employee> getEmp() {
		return emp;
	}


	/**
	 * @param emp the emp to set
	 */
	public void setEmp(List<Employee> emp) {
		this.emp = emp;
	}


	public Project( String name) {
		super();
		this.name = name;
	}


	public Project() {
		super();
	}


	/**
	 * @return the proj_id
	 */
	public int getProj_id() {
		return proj_id;
	}


	/**
	 * @param proj_id the proj_id to set
	 */
	public void setProj_id(int proj_id) {
		this.proj_id = proj_id;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Project [proj_id=" + proj_id + ", name=" + name + "]";
	}


	
	
	
	
	
	

}
