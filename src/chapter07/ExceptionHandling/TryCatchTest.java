package chapter07.ExceptionHandling;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
/* 1. ArrayIndexOutofBoundsException
 * 2. ClassCastException
 * 3.IllegalArguementException
 * 4.IllegalStateException
 * 5.NullPointerException
 * 6.NumberFormatException
 * 7.AssertError
 * 8.ExceptionInInitializerError
 * 9.StackOverflowerError*/
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
