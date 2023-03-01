package com.innoventes.test.app.mapper;

import java.util.List;
import com.innoventes.test.app.dto.EmployeeDTO;
import com.innoventes.test.app.entity.Employee;

public interface EmployeeMapper 
{
	EmployeeDTO save(Employee emp);
	
	List<EmployeeDTO> saveAll(List<Employee> emp);

	EmployeeDTO getid(Integer id);

	EmployeeDTO deleteid(Integer id);
	
	EmployeeDTO deleteall(Employee emp);
	
	
}
