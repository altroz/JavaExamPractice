package com.OCP46;

import java.io.Console;

public class Echo {
	public static void main(String[]args){
		Console console = System.console();
		
		if(console ==null){
			System.err.println("Cannot retrieve console object- are you running your from an IDE? Exiting the application...");
			System.exit(-1);
		}
		console.printf(console.readLine());
	}
}
