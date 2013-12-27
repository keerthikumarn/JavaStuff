package com.springjetty.integration.configuration;

import org.apache.cxf.jaxrs.client.ClientConfiguration;
import org.apache.cxf.jaxrs.client.JAXRSClientFactory;
import org.apache.cxf.jaxrs.client.WebClient;
import org.apache.cxf.transport.http.HTTPConduit;
import org.apache.cxf.transports.http.configuration.ConnectionType;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class IntegrationTest {

	/** Long time out to enable debugging : 20 min */
	static private final long CLIENT_TIMEOUT = 20 * 60 * 1000;

	/** Injected by test runner */
	private IntegrationTestContext context = new IntegrationTestContext();
	
	public static void startJettyServer() throws Exception {
		System.out.println("Starting up the Jetty Server !!");
		Server server = new Server(8080);
		WebAppContext handler = new WebAppContext();
		handler.setResourceBase("/");
		handler.setContextPath("/");
		server.setHandler(handler);
		server.start();
	}

	/** Getting the client stub for the given service **/
	public <T> T newServiceClient(Class<T> serviceClass) {
		T proxyService = JAXRSClientFactory.create(context.getJettyServer()
				.getJettyURL(), serviceClass);
		ClientConfiguration config = WebClient.getConfig(proxyService);
		HTTPConduit conduit = config.getHttpConduit();
		conduit.getClient().setConnection(ConnectionType.CLOSE);
		conduit.getClient().setReceiveTimeout(CLIENT_TIMEOUT);

		return proxyService;
	}
	
	/** Get a Spring bean from the RM server */
	  public <T> T getJettyServerService(Class<T> clazz) {
	    return context.getJettyServer().getContext().getBean(clazz);
	  }

	public IntegrationTestContext getContext() {
		return context;
	}
	
	@Autowired
	public void setContext(IntegrationTestContext context) {
		this.context = context;
	}
}
