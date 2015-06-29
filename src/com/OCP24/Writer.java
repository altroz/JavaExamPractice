package com.OCP24;

import java.io.*;
public class Writer {
	public static void main(String[]args){
		try{
			boolean newFile = false;
			File file = new File("myFirstFile.txt");
			System.out.println(file.exists());
			newFile = file.createNewFile();
			System.out.println(newFile);
			System.out.println(file.exists());
		}
		catch(IOException e){
			System.err.println(e);
		}
	}
}
