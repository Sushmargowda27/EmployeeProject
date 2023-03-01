package com.innoventes.test.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.innoventes.test.app.entity.Employee;
import com.innoventes.test.app.repository.EmployeeRepository;

@Service 
public class EmployeeService 
{
	@Autowired
	private EmployeeRepository emprep;
	
	public Employee save(Employee emp)
	{
		return emprep.save(emp);
	}
	public List<Employee> saveAll(List<Employee> emp)
	{
		return emprep.saveAll(emp);
	}
	public Employee getid(Integer id)
	{
		return emprep.getById(id);
	}
	public void deleteid(Integer id)
	{
		emprep.deleteById(id);
	}
	public void deleteall(List<Employee> emp)
	{
		emprep.deleteAll();

	}
}
