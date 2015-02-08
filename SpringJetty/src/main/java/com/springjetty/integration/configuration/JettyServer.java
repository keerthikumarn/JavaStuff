package com.springjetty.integration.configuration;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.ContextHandlerCollection;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Wrapper class for Jetty Server instance !!
 */
public class JettyServer {
	
	 /** Spring context */
	  private GenericXmlApplicationContext context;
	
	private static final String JETTY_URL_PROPERTY = "http://localhost:8085";

	private Server server;

	public JettyServer() {
		this(8085);
	}

	public JettyServer(Integer runningPort) {
		server = new Server(runningPort);
	}

	public void setHandler(ContextHandlerCollection contexts) {
		server.setHandler(contexts);
	}

	public void start() throws Exception {
		server.start();
		System.out.println("Jetty Server Started Successfully !!");
	}

	public void stop() throws Exception {
		server.stop();
		server.join();
	}

	public boolean isStarted() {
		return server.isStarted();
	}

	public boolean isStopped() {
		return server.isStopped();
	}

	public String getJettyURL() {
		return System.getProperty(JETTY_URL_PROPERTY);
	}
	
	public ApplicationContext getContext() {
	    return context;
	  }
}
