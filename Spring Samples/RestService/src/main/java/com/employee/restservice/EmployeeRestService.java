package com.employee.restservice;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.employee.model.Employee;

@Path("/employee")
public interface EmployeeRestService {

	@POST
	@Consumes(MediaType.TEXT_XML)
	@Path("/create")
	public Response createEmployee();
	
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	@Path("/list")
	public List<Employee> listEmployees();
}
