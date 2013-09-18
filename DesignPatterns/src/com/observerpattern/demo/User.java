package com.observerpattern.demo;

public class User implements Observer {

	private String article;
	private Subject blog;
	
	@Override
	public void update() {
		System.out.println("Object state change reported by the observer !!");
		article = (String) blog.getUpdate();
	}

	@Override
	public void setSubject(Subject blog) {
		this.blog = blog;
		article = "No new article yet !!";
	}
	
	public String getArticle() {
		return article;
	}

}
