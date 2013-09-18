package com.employee.Util;

import com.employee.model.Employee;

public class EmployeeUtil {
	
	public static Employee buildEmpObject(){
		Employee emp = new Employee();
		emp.setName("User1");
		emp.setDepartment("APT");
		return emp;
	}
}
