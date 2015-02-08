package com.springjetty.integration.configuration;

public class IntegrationTestContext {
	private JettyServer jettyServer;

	public JettyServer getJettyServer() {
		return jettyServer;
	}

	public void setJettyServer(JettyServer jettyServer) {
		this.jettyServer = jettyServer;
	}
	
}
