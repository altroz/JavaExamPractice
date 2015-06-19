package chapter07.ExceptionHandling;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class TryCatchTest {
	
	private static List<Integer> list;
	private static final int SIZE = 10;
	
	public static void main(String[] args){
	PrintWriter out = null;

	try{
		System.out.println("Entered Try Statement");
		out = new PrintWriter(new FileWriter("OutFile.txt"));
		
		for(int i = 0; i<SIZE; i++){
			out.println("Value at: "+i+ " = "+ list.get(i));
		}
	}catch(IOException | IndexOutOfBoundsException e) 
	{System.err.println("Caught Exception:  "+e.getMessage());}
	}
}
