package com.harman.demo.jspider.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.harman.demo.jspider.model.Employee;
import com.harman.demo.jspider.service.JspidersService;

@Controller
public class JspidersController 
{
	@Autowired
	private JspidersService jspiservice;
	
	JspidersController()
	{
		System.out.println("hii");
	}
	@RequestMapping("/test")
	public ResponseEntity<String> testThis()
	{
		return ResponseEntity.ok("this is Working fine");
	}
	
	@RequestMapping("/save")
	public ResponseEntity<Employee> save(@RequestBody Employee emp)
	{
		Employee res=jspiservice.save(emp);
		if(res!=null)
		{
			return ResponseEntity.ok(res);
		}
		else
		{
			return ResponseEntity.status(400).body(null);
		}
	}
	@RequestMapping("/saveall")
	public ResponseEntity<List<Employee>> saveAll(@RequestBody List<Employee> emp)
	{
		List<Employee> res1=jspiservice.saveAll(emp);
		if(res1!=null)
		{
			return ResponseEntity.ok(res1);
		}
		else
		{
			return ResponseEntity.status(400).body(null);
		}
	}
	@RequestMapping("/delete/{id}")
	public void deleteById(@PathVariable("id") Integer id)
	{
		jspiservice.deleteById(id);
	}
	@RequestMapping("/deleteall")
	public void deleteall(Employee emp)
	{
		jspiservice.deleteAll(emp);
	}
	@RequestMapping("/count")
	public long count()
	{
		long res2=jspiservice.count();
		if(res2!=0)
		{
			return res2;
		}
		else
		{
			return 0;
		}
	}
	@RequestMapping("/exists/{eId}")
	public boolean existsById(@PathVariable("eId") Integer id)
	{
		return jspiservice.existsById(id);
	}
}

