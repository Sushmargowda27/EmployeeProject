package com.harman.demo.jspider.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.harman.demo.jspider.model.Employee;




//@Repository
public interface JspidersDao extends JpaRepository<Employee,Integer>
{
	
}
