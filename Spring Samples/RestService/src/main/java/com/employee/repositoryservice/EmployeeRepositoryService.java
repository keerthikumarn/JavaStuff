package com.employee.repositoryservice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employee.model.Employee;

@Repository
public interface EmployeeRepositoryService extends JpaRepository<Employee, Integer>{
	
}
