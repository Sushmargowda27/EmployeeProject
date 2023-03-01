package com.jobs.december.dao;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Controller;

import com.jobs.december.model.Employee;
@Controller
public class EmployeeDAO 
{	
	public EmployeeDAO()
	{
		System.out.println("I am Employee DAO");
	}
	
	Map<Integer,Employee> database=new HashMap<>();
	
	public Map<Integer,Employee> loadObjects()
	{
		Employee e1=new Employee("scott",11,20000.0,"developer");
		Employee e2=new Employee("dhoni",12,20000.0,"QA");
		Employee e3=new Employee("virat",13,20000.0,"Tester");
		
		database.put(e1.geteId(), e1);
		database.put(e2.geteId(), e2);
		database.put(e3.geteId(), e3);
		return database;
	}
	
	public Employee getById(Integer id)
	{
		return database.get(id);
	}
	
	public List<Employee> getAll()
	{
		List<Employee> list=new ArrayList<>();
		Set<java.util.Map.Entry<Integer, Employee>> datas=database.entrySet();
		for(java.util.Map.Entry<Integer, Employee> data:datas)
		{
			list.add(data.getValue());
		}
		return list;
	}
	
	public List<Employee> savedata(Employee emp)
	{
		List<Employee> listdata=new ArrayList<>();
		if(database!=null)
		{
			database.put(emp.geteId(),emp);
		}
		database.entrySet().stream().forEach(p->listdata.add(p.getValue()));
		return listdata;
	}
	public boolean updateemp(Employee emp)
	{
//		List<Employee> listdata1=new ArrayList<>();
		Map<Integer,Employee> h1=new HashMap<>();
		h1.put(emp.geteId(),emp);
		if(database.containsKey(emp.geteId()))
		{
			database.put(emp.geteId(),emp);
			return true;
		}
		else
		{
			return false;
		}
//		database.entrySet().stream().forEach(p->listdata1.add(p.getValue()));
	}
	public Employee deleteemp(Integer id)
	{
		return database.remove(id);
	}
	public Boolean updatenew(Employee emp)
	{
		database.put(emp.geteId(), emp);
		return true;
	}
}








