package com.harman.demo.jspider.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.harman.demo.jspider.dao.JspidersDao;
import com.harman.demo.jspider.model.Employee;


@Service
public class JspidersService 
{
	@Autowired
	private JspidersDao jspidao;
	JspidersService()
	{
		System.out.println("hii1");
	}
	public Employee save(Employee emp)
	{
		return jspidao.save(emp);
	}
	public List<Employee> saveAll(List<Employee> emp)
	{
		return jspidao.saveAll(emp);
	}
	public void deleteById(Integer id)
	{
		jspidao.deleteById(id);
	}
	public void deleteAll(Employee emp)
	{
		jspidao.deleteAll();
	}
	public long count()
	{
		return jspidao.count();
	}
	public boolean existsById(Integer id)
	{
		return jspidao.existsById(id);
	}
}
