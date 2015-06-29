package com.OCP23;

public class Logger {
	private Logger(){	}
	public static Logger myInstance;
	public static Logger getInstance(){
		if (myInstance == null){
			myInstance = new Logger();
		}
		return myInstance;
	}
	public void log(String s){
		System.err.println(s);
	}
}
