package com.observerpattern.demo;

public interface Observer {
	/** To notify the updates to the observers **/
	public void update();
	
	/** To set the subject **/
	public void setSubject(Subject subject);
}
