package com.keerthi.restservice.demo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public interface HelloRestService {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayPlainTextHello();

	@GET
	@Path("/xml")
	@Produces(MediaType.TEXT_XML)
	public String sayXMLHello();

	// This method is called if HTML is request
	@GET
	@Path("/html")
	@Produces(MediaType.TEXT_HTML)
	public String sayHtmlHello();
}
