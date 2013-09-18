package com.observerpattern.demo;

import java.util.ArrayList;
import java.util.List;

public class Blog implements Subject {
	
	List<Observer> observersList;
	private boolean stateChanged;

	
	public Blog(){
		this.observersList = new ArrayList<Observer>();
		stateChanged = false;
	}
	
	@Override
	public void registerObserver(Observer observer) {
		observersList.add(observer);
	}

	@Override
	public void notifyObserver() {
		if(stateChanged){
			for(Observer observer : observersList){
				observer.update();
			}
		}

	}

	@Override
	public void unregisterObserver(Observer observer) {
		observersList.remove(observer);
	}

	@Override
	public Object getUpdate() {
		Object changedState = null;
		if(stateChanged){
			changedState = "Observer Design Pattern";
		}
		return changedState;
	}
	
	public void postNewArticle(){
		stateChanged = true;
		notifyObserver();
	}

}
