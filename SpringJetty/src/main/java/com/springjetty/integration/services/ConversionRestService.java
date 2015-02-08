package com.springjetty.integration.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("conversionservice")
public interface ConversionRestService {
	@GET
	@Path("/inchtofeet/{i}")
	@Produces(MediaType.TEXT_XML)
	public String convertInchToFeet(@PathParam("i") int i);
	
	@GET
	@Path("/feettoinch/{f}")
	@Produces(MediaType.TEXT_XML)
	public String convertFeetToInch(@PathParam("f") int f);
}
