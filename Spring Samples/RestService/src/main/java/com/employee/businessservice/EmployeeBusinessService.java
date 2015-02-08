package com.employee.businessservice;

import java.util.List;

import com.employee.model.Employee;

public interface EmployeeBusinessService {
	
	public void createEmployee(Employee employee);
	
	public List<Employee> listEmployees();
}
