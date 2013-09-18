package com.hibernate.samples.basic;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.AUTO;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import static org.hibernate.annotations.CacheConcurrencyStrategy.READ_ONLY;

@Entity
@Cacheable
@Cache(usage = READ_ONLY)
@Table(name = "EMPLOYEE")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = AUTO )
	@Column(name = "employee_id")
	private int empId;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "cell_no")
	private String cellNo;
	
	@ManyToOne
	@JoinColumn(name = "department_id")
	private Department department;
	
	public Employee() {
        
    }
     
    public Employee(String firstName, String lastName, String cellNo) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cellNo = cellNo;
    }

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCellNo() {
		return cellNo;
	}

	public void setCellNo(String cellNo) {
		this.cellNo = cellNo;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
 
}
