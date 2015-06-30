package com.OCP25;

public class Logger {
	private Logger(){	}
	private static Logger myInstance;
	public static Logger getInstance(){
		if(myInstance == null){
			synchronized(Logger.class){
			myInstance = new Logger();}
		}
		return myInstance;
	}
	public void log(String[]s){
		System.err.println(s);
	}
}
