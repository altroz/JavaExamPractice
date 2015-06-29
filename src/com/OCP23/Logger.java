package com.OCP23;

/*  1. Logger class must be instantiated only once in application. It is to ensure
 * 		that the whole of the application make use of that some logger instance.	
 * 	2. Declare the constructor private to prevent clients from instantiating an object of this class 
 * 		directly. 
 *  3. By default, this field is initialized to NULL
 *  4. The static method to be used by clients to get the instance of the logger class. */
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
