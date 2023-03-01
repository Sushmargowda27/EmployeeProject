package com.innoventes.test.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.innoventes.test.app.entity.Employee;
import com.innoventes.test.app.service.EmployeeService;

@Controller  
public class EmployeeController
{
	@Autowired
	private EmployeeService empser;
	
	@RequestMapping("/test")
	public ResponseEntity<String> test()
	{
		return ResponseEntity.ok("test is completed");
	} 
	@RequestMapping("/create")
	public ResponseEntity<Employee> save(@RequestBody Employee emp)
	{
		Employee res=empser.save(emp);
		if(res!=null)
		{
			return ResponseEntity.ok(emp);
		}
		else
		{
			return ResponseEntity.status(400).body(null);
		}
	} 
	@RequestMapping("/createall")
	public ResponseEntity<List<Employee>> saveAll(@RequestBody List<Employee> emp)
	{
		List<Employee> res1=empser.saveAll(emp);
		if(res1!=null)
		{
			return ResponseEntity.ok(emp);
		}
		else
		{
			return ResponseEntity.status(400).body(null);
		}
	}
	@RequestMapping("/getById/{id}")
	public ResponseEntity<Employee> getid(@PathVariable("id") Integer id)
	{
		Employee res2=empser.getid(id);
		if(res2!=null)
		{
			return ResponseEntity.ok(res2);
		}
		else
		{
			return ResponseEntity.status(400).body(null);
		}
	}
	@RequestMapping("/delete/{id}")
	public void deleteid(@PathVariable("id") Integer id)
	{
		empser.deleteid(id);
	}
	@RequestMapping("/deleteall")
	public void deleteall(List<Employee> emp)
	{
		empser.deleteall(emp);
	}
}

