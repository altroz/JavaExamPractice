package com.OCP24;

import java.io.*;
public class TestFileWriter {
	public static void main(String[]args){
		char[]in = new char[50];
		int size = 0;
		
		try{
			File file = new File("MySecondFile.txt");
			FileWriter fw = new FileWriter(file);
			fw.write("Hello World");
			fw.flush();
			fw.close();
			
			FileReader fr = new FileReader(file);
			size = fr.read(in);
			System.out.println("size = "+ size);
			for (char c : in)
				System.out.print(c);
			fr.close();
		}
		catch(IOException e){
			System.err.println(e);
		}
		
	}
}
