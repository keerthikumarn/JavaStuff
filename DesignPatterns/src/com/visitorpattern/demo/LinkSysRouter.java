package com.visitorpattern.demo;

public class LinkSysRouter implements Router {

	@Override
	public void sendData(char[] data) {
		// TODO Auto-generated method stub

	}

	@Override
	public void acceptData(char[] data) {
		// TODO Auto-generated method stub

	}

	@Override
	public void accept(RouterVisitor visitor) {
		visitor.visit(this);
	}

}
