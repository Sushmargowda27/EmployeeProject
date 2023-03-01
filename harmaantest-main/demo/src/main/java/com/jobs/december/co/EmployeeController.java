package com.jobs.december.co;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jobs.december.model.Employee;
import com.jobs.december.sr.EmployeeServices;

@Controller
public class EmployeeController 
{
	@Autowired
	private EmployeeServices service;
	
	public EmployeeController()
	{
		System.out.println("I am Employee Controller");
	}
	@RequestMapping("/getById/{id}")
	public ResponseEntity<Employee> getEmployee(@PathVariable("id") Integer id)
	{
		Employee emp=service.getById(id);
		return ResponseEntity.status(200).body(emp);
	}
	@RequestMapping("/load/data")
	public ResponseEntity<String> loaddata()
	{
		boolean value=service.loadObjects();
		if(value)
		{
			return ResponseEntity.status(200).body("data loaded successfully to the hashmap");
		}
		else
		{
			return ResponseEntity.status(403).body("data could not loaded data to the hashmap");
		}
	}
	@RequestMapping("/getAll/details")
	public ResponseEntity<List<Employee>> getAll()
	{
		List<Employee> l1=service.getAll();
		if(l1!=null)
		{
			return ResponseEntity.ok(l1);
		}
		else 
		{
			return ResponseEntity.status(400).body(l1);
		}
	}
	@RequestMapping("/save")
		public ResponseEntity<List<Employee>> savedata(@RequestBody Employee emp)
		{
			List<Employee> listdata=service.saveEmp(emp);
			if(listdata!=null && listdata.size()>0)
			{
				return ResponseEntity.status(200).body(listdata);
			}
			else
			{
				return ResponseEntity.status(400).body(listdata);
			}
		}
	@RequestMapping("/update")
	public ResponseEntity<String> updateDetails(@RequestBody Employee emp)
	{
		Boolean listdata1= service.updateemp(emp);
		if(listdata1==true)
		{
			String s="Data is updated";
			return ResponseEntity.ok(s);
		}
		else
		{
			String s="Data is not updated";
			return ResponseEntity.ok(s);
		}
	}
	@RequestMapping("/delete/{id}")
	public ResponseEntity<Employee> deleteEmp(@PathVariable("id") Integer id)
	{
		Employee emp=service.deleteemp(id);
		return ResponseEntity.status(200).body(emp);
	}
	@RequestMapping("/updatenewvalue")
	public ResponseEntity<String> updatenew(@RequestBody Employee emp)
	{
		Boolean listdata1=service.updatenew(emp);
		if(listdata1==true)
		{
			String s="Data is updated";
			return ResponseEntity.ok(s);
		}
		else
		{
			String s="Data is not updated";
			return ResponseEntity.ok(s);
		}
	}
}
