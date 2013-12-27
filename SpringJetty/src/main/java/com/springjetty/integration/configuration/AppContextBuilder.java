package com.springjetty.integration.configuration;

import org.eclipse.jetty.webapp.WebAppContext;


public class AppContextBuilder {
	
	private WebAppContext webAppContext;
	
	public WebAppContext buildWebAppContext(){
		System.out.println("Building up the web app context for the jetty server");
		webAppContext =  new WebAppContext();
		webAppContext.setDescriptor(webAppContext + "/WEB-INF/web.xml");
		webAppContext.setResourceBase(".");
		webAppContext.setContextPath("/startJetty");
		System.out.println("Web app context is now ready for the jetty server");
		return webAppContext;
	}
}
