package com.timer.demo;

import java.util.TimerTask;

public class Task extends TimerTask {

	int i = 0;
	
	@Override
	public void run() {
		i++;
		if(i <= 5){
			System.out.println("Hello Keerthi !!");
		}else{
			System.out.println("Done !");
			this.cancel();
		}
	}

}
