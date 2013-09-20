package com.tostringbuilder.demo;

import java.util.Date;

public class PGStudent extends AbstractStudent {

	private static final long serialVersionUID = 866367793806443235L;
	
	private Date lastLoggedIn;

	public Date getLastLoggedIn() {
		return lastLoggedIn;
	}

	public void setLastLoggedIn(Date lastLoggedIn) {
		this.lastLoggedIn = lastLoggedIn;
	}

}
