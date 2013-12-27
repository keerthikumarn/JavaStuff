package com.springjetty.integration.tests;

import org.junit.Before;
import org.junit.Test;

import com.springjetty.integration.configuration.IntegrationTest;
import com.springjetty.integration.services.ConversionRestService;

public class ConversionRestServiceIT extends IntegrationTest{
	private ConversionRestService conversionRestService;
	
	@Before
	public void setUp() throws Exception{
		startJettyServer();
		conversionRestService =  newServiceClient(ConversionRestService.class);
	}
	
	@Test
	public void testInchConversion(){
		conversionRestService.convertInchToFeet(10);
	}
}
