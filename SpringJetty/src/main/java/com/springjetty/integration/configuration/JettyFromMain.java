package com.springjetty.integration.configuration;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

public class JettyFromMain {

	public static void main(String[] args) throws Exception {
		System.out.println("Starting up the Jetty Server !!");
		Server server = new Server(8080);
		WebAppContext handler = new WebAppContext();
		handler.setResourceBase("/");
		handler.setContextPath("/");
		server.setHandler(handler);
		server.start();
	}

}
