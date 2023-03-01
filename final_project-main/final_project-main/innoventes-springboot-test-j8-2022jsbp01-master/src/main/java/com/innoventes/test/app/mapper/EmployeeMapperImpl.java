package com.innoventes.test.app.mapper;

import java.util.List;

import org.springframework.stereotype.Component;
import com.innoventes.test.app.dto.EmployeeDTO;
import com.innoventes.test.app.entity.Employee;

@Component 
public class EmployeeMapperImpl implements EmployeeMapper
{
	@Override
	public EmployeeDTO save(Employee emp)
	{
		EmployeeDTO dto=new EmployeeDTO();
		dto.setEmpid(emp.getEmpid());
		dto.setName(emp.getName());
		dto.setSalary(emp.getSalary());
		dto.setCmpid(emp.getCmpid());
		return dto;
	}

	@Override
	public List<EmployeeDTO> saveAll(List<Employee> emp) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmployeeDTO getid(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmployeeDTO deleteid(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmployeeDTO deleteall(Employee emp) {
		// TODO Auto-generated method stub
		return null;
	}
}
