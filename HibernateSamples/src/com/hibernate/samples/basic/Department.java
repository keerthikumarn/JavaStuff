package com.hibernate.samples.basic;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static  javax.persistence.GenerationType.AUTO;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name = "DEPARTMENT")
public class Department {
	@Id
    @GeneratedValue(strategy = AUTO)
    @Column(name="dept_id")
    private Long departmentId;
     
    @Column(name="dept_name")
    private String departmentName;
     
    @OneToMany(mappedBy = "department")
    private Set<Employee> employees;

	public Long getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public Set<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}
    
}
