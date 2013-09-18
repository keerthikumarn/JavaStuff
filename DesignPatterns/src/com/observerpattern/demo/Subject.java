package com.observerpattern.demo;

public interface Subject {

	/** To register the observer **/
	public void registerObserver(Observer observer);
	
	/** To notify the observer **/
	public void notifyObserver();
	
	/** To unregister the observer **/
	public void unregisterObserver(Observer observer);
	
	/** To get the update(s) (object state changes) **/
	public Object getUpdate();
}
