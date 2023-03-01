package com.jobs.december.model;

public class Employee 
{
	private String name;
	private Integer eId;
	private Double salary;
	private String designation;
	public Employee(String name, Integer eId, Double salary, String designation) {
		super();
		this.name = name;
		this.eId = eId;
		this.salary = salary;
		this.designation = designation;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer geteId() {
		return eId;
	}
	public void seteId(Integer eId) {
		this.eId = eId;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
}
