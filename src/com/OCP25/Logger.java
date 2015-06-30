package com.OCP25;

public class Logger {
	private Logger() {
	}

	private static Logger myInstance;

	public static class LoggerHolder {
		public static Logger logger = new Logger();

	}

	public static Logger getInstance() {
		return LoggerHolder.logger;
	}

	public void log(String[] s) {
		System.err.println(s);
	}
}
