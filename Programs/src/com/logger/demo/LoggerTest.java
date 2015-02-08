package com.logger.demo;

import java.util.logging.ConsoleHandler;
import java.util.logging.Handler;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;

public class LoggerTest {

	public static void main(String[] args) {
		Logger logger = Logger.getLogger("conlog");
		Handler handler = new ConsoleHandler();
		handler.setFormatter(new XMLFormatter());
		logger.addHandler(handler);
		logger.info("logger info message");
		logger.severe("logger severe message");
	}

}
