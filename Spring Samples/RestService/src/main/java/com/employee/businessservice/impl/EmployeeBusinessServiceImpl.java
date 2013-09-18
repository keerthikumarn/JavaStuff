package com.employee.businessservice.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.businessservice.EmployeeBusinessService;
import com.employee.model.Employee;
import com.employee.repositoryservice.EmployeeRepositoryService;

@Service
public class EmployeeBusinessServiceImpl implements EmployeeBusinessService{

	private EmployeeRepositoryService repoService;
	
	public void createEmployee(Employee employee) {
		employee = repoService.save(employee);
		System.out.println("Employee data saved successfully !");
	}

	public List<Employee> listEmployees() {
		return repoService.findAll();
	}
	
	@Autowired
	public void setRepoService(EmployeeRepositoryService repoService) {
		this.repoService = repoService;
	}

}
