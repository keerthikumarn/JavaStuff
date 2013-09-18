package com.employee.restservice.impl;

import java.util.List;

import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.Util.EmployeeUtil;
import com.employee.businessservice.EmployeeBusinessService;
import com.employee.model.Employee;
import com.employee.restservice.EmployeeRestService;

@Service("employeeRestService")
public class EmployeeRestServiceImpl implements EmployeeRestService{
	
	private EmployeeBusinessService businessService;

	public Response createEmployee() {
		Employee emp = EmployeeUtil.buildEmpObject();
		businessService.createEmployee(emp);
		return Response.ok().build();
	}

	public List<Employee> listEmployees() {
		return businessService.listEmployees();
	}
	
	@Autowired
	public void setBusinessService(EmployeeBusinessService businessService) {
		this.businessService = businessService;
	}

}
