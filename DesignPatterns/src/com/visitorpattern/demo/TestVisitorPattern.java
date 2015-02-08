package com.visitorpattern.demo;

import junit.framework.TestCase;

public class TestVisitorPattern extends TestCase{
	
	private WindowsConfigurator windowsConfigurator;
	private LinuxConfigurator linuxConfigurator;
	private DLinkRouter dLink;
	private TPLinkRouter tpLink;
	private LinkSysRouter linkSys;
	
	public void setUp(){
		windowsConfigurator = new WindowsConfigurator();
		linuxConfigurator = new LinuxConfigurator();
		dLink = new DLinkRouter();
		tpLink = new TPLinkRouter();
		linkSys = new LinkSysRouter();
	}
	
	public void testDLink(){
		dLink.accept(windowsConfigurator);
		dLink.accept(linuxConfigurator);
	}
	
	public void testTPLink(){
		tpLink.accept(windowsConfigurator);
		tpLink.accept(linuxConfigurator);
	}

	public void testLinkSys(){
		linkSys.accept(windowsConfigurator);
		linkSys.accept(linuxConfigurator);
	}
}
