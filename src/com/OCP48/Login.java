package com.OCP48;

import java.io.Console;
import java.util.Arrays;

public class Login {
	public static void main(String[]args){
		Console console = System.console();
		if(console != null){
			String userName = null;
			char[] password = null;
			
			userName = console.readLine("Enter your username");
			password = console.readPassword("Enter your password");
			
			if(userName.equals("scrat")&& new String(password).equals("nuts")){
				console.printf("Login successful");
			}
			else console.printf("Restart application and try again");
			Arrays.fill(password, ' ');
 		}
		
	}
}
