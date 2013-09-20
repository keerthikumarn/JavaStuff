package com.timer.demo;

import java.util.Timer;

public class TimerDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Task task = new Task();
		new Timer("StopWatch").schedule(task, 1000, 1000);
	}

}
