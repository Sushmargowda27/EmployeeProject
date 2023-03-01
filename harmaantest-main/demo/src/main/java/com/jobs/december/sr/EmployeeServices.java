package com.jobs.december.sr;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jobs.december.dao.EmployeeDAO;
import com.jobs.december.model.Employee;

@Service
public class EmployeeServices 
{
	
	@Autowired
	private EmployeeDAO dao;
	
	public EmployeeServices()
	{
		System.out.println("I am Employee Services");
	}
	
	public Employee getById(Integer id)
	{
		return dao.getById(id);
	}
	
	public boolean loadObjects()
	{
		return dao.loadObjects().size()>0?true:false;
	}
	public List<Employee> getAll()
	{
		return dao.getAll();
	}
	public List<Employee> saveEmp(Employee emp)
	{
		return dao.savedata(emp);
	}
	public boolean updateemp(Employee emp)
	{
		return dao.updateemp(emp);
	}
	public Employee deleteemp(Integer id)
	{
		return dao.deleteemp(id);
	}
	public boolean updatenew(Employee emp)
	{
		return dao.updatenew(emp);
	}
}
