package com.OCP47;

public class ParseString2 {
	public static void main(String[]args){
		String str = "C:\\work\\program\\parser";
		String []dirList = str.split("\\\\");
		
		for(int i = 0; i< dirList.length; i++){
			System.out.println(dirList[i]);
		}
	}
}
